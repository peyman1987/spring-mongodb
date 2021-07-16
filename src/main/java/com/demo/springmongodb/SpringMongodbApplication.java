package com.demo.springmongodb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringMongodbApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringMongodbApplication.class);

	@PostConstruct
	public void getLogger() {
		logger.info("Application started...");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbApplication.class, args);
	}

}
