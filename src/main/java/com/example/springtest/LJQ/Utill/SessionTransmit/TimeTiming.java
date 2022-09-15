package com.example.springtest.LJQ.Utill.SessionTransmit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component // 把此类托管给 Spring，不能省略
public class TimeTiming {
        // 添加定时任务
        // CSDN https://blog.csdn.net/qq_39731011/article/details/123332641
        @Scheduled(cron = "0 * 14 * * ?") // cron表达式：每天下午两点开始  每隔一分钟执行一次
        public static void doTask(){
            System.out.println("我是定时任务~");
        }
    }

