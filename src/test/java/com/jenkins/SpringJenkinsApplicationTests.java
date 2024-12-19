package com.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	public static Log logger = LogFactory.getLog(SpringJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("test case executing...!!");
		assertEquals(true, true);
	}

}
