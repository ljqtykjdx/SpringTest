package com.example.springtest.LJQ;

import com.example.springtest.LJQ.Utill.TimeConversion;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
class SpringTestApplicationTests {

    @Test
    void TimeConversionTest() {
        TimeConversion.timeConversion();
    }

    @Test
    void contestLoads(){

    }
}
