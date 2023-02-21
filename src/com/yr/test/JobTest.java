package com.yr.test;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class JobTest implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		JobDetail jobDetail = context.getJobDetail();
		String name = jobDetail.getJobDataMap().getString("key");
		System.out.println("ͨ��key�õ�  " + name + "  ��ǰʱ��:" + new Date());
	}

}
