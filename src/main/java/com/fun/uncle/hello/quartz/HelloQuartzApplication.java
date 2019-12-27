package com.fun.uncle.hello.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
* @Description:    使用quartz来实现定时任务
* @Author:         Xian
* @CreateDate:     2019/12/27 11:10
* @Version:        0.0.1-SNAPSHOT
*/
@EnableScheduling
@SpringBootApplication
public class HelloQuartzApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloQuartzApplication.class, args);
    }

}
