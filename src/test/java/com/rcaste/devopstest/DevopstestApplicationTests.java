package com.rcaste.devopstest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.rcaste.devopstest.controller.HomeController;



@SpringBootTest
class DevopstestApplicationTests {

	@Test
    public void testApp(){
        HomeController hc = new HomeController();
        String result = hc.home();
        assertEquals(result, "Das Boot, reporting for duty! v. Video Tutorial");
    }
}
