package com.matrix.platform.job;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class HelloQuartzJob implements Job
{

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException
    {
        // TODO Auto-generated method stub
        System.out.println("---------------->>>>>----Hello, Quartz! - executing its JOB at " + new Date() + " by "
                + context.getTrigger().getDescription() + "|" + context.getTrigger().getCalendarName());
    }

}
