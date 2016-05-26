package com.jci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jci.Lab1SimpleWebApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Lab1SimpleWebApplication.class)
@WebAppConfiguration
public class Lab1SimpleWebApplicationTests {

	@Test
	public void contextLoads() {
	}

}
