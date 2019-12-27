package com.fun.uncle.hello.quartz.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Description:
 * @Author: Xian
 * @CreateDate: 2019/12/27  11:14
 * @Version: 0.0.1-SNAPSHOT
 */
@Component
public class PrintCurrentTimeTask {

    @Scheduled(cron = "0/5 * * * * ? ")
    public void printCurrentTimeTask() {
        System.out.println("【current】:" + LocalDateTime.now());
    }
}
