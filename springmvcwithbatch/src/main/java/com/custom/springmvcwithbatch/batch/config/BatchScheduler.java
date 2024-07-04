package com.custom.springmvcwithbatch.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableBatchProcessing
public class BatchScheduler { 
  
    @Autowired
    private JobLauncher jobLauncher; 
  
//    @Autowired
//    private Job job; 
  
    @Scheduled(cron = "*/10 * * * * *") // Schedule at every second
    public void performBatchJob() throws Exception { 
    	System.out.println("=============== BatchScheduler executed!!!!!!================");
        JobParameters params = new JobParametersBuilder() 
                .addString("JobID", String.valueOf(System.currentTimeMillis())) 
                .toJobParameters(); 
//        jobLauncher.run(job, params); 
    } 
} 