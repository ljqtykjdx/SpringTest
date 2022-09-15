package com.example.springtest.LJQ;

import com.example.springtest.LJQ.Utill.SessionTransmit.TimeTiming;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling //开启定时任务
@SpringBootApplication
public class SpringTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringTestApplication.class, args);
        TimeTiming.doTask();
    }

}
