package com.matrix.platform.job;

import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerKey;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.SimpleTriggerImpl;

public class HelloQuartzScheduling
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        
        Scheduler scheduler = null;
        try
        {
            scheduler = schedulerFactory.getScheduler();
            System.out.println(scheduler.getSchedulerName());
            System.out.println(scheduler.getSchedulerInstanceId());
            
            JobDetailImpl jobDetail = new JobDetailImpl();
            jobDetail.setName("helloQuartzJob");
            jobDetail.setDescription("helloQuartzJob-desc");
            jobDetail.setGroup(Scheduler.DEFAULT_GROUP);
            jobDetail.setJobClass(HelloQuartzJob.class);
//        jobDetail.setJobDataMap(jobDataMap);
            
            SimpleTriggerImpl simpleTrigger = new SimpleTriggerImpl();
            
            simpleTrigger.setName("hello-trigger");
            simpleTrigger.setGroup(Scheduler.DEFAULT_GROUP);
            simpleTrigger.setStartTime(new Date(System.currentTimeMillis()));
            simpleTrigger.setRepeatInterval(5000);
            simpleTrigger.setRepeatCount(10);
            
            scheduler.scheduleJob(jobDetail, simpleTrigger);
            
            scheduler.start();
            
//            JobKey jobKey = new JobKey("helloQuartzJob");
//            scheduler.pauseJob(jobKey);
//            
//            TriggerKey triggerKey = new TriggerKey("hello-trigger");
//            scheduler.pauseTrigger(triggerKey);
            
        }
        catch(SchedulerException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
