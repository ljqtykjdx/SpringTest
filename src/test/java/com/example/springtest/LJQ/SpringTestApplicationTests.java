package com.example.springtest.LJQ;

import com.example.springtest.LJQ.Utill.SessionTransmit.TimeTiming;
import com.example.springtest.LJQ.Utill.TimeConversion;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.test.context.ContextConfiguration;


@EnableScheduling //开启定时任务
@SpringBootTest
class SpringTestApplicationTests {

    @Test
    void TimeConversionTest() {
        TimeConversion.timeConversion();
    }

    @Test
    void contestLoads(){
        //TimeTiming.doTask();
    }
}
