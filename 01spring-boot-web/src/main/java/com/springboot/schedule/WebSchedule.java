package com.springboot.schedule;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

/**
 * @description: 调度
 **/
@Configuration
@EnableScheduling
public class WebSchedule {

    @Scheduled(cron = "0/20 * * * * ?") // 每20秒执行一次
    public void scheduler(){
        System.out.println("调度执行了....."+new Date());
    }

}
