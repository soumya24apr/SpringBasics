package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.example.demo.basic")
public class Springin5stepsApplication {

	private static Logger logger = LoggerFactory.getLogger(Springin5stepsApplication.class);
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Springin5stepsApplication.class);
		BinarySearchImpl binarysearch = context.getBean(BinarySearchImpl.class);
		logger.info("{}",binarysearch);
		System.out.println("{}" + binarysearch);
		context.close();
	}
}

