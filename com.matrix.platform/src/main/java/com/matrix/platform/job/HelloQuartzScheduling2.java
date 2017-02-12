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

public class HelloQuartzScheduling2
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        
        Scheduler scheduler = null;
        try
        {
            scheduler = schedulerFactory.getScheduler("DefaultQuartzScheduler");
            
            
            JobKey jobKey = new JobKey("helloQuartzJob");
            scheduler.pauseJob(jobKey);
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
