package com.jenkins;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	public static Log logger = LogFactory.getLog(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("application started...!");
	}

	public static void main(String[] args) {
		logger.info("application executed...!!");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
