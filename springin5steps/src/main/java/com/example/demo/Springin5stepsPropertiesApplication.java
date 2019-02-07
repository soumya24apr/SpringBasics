package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.demo.basic.BinarySearchImpl;
import com.example.demo.property.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class Springin5stepsPropertiesApplication {

	private static Logger logger = LoggerFactory.getLogger(Springin5stepsPropertiesApplication.class);
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Springin5stepsPropertiesApplication.class);
		SomeExternalService someexternalservice = context.getBean(SomeExternalService.class);
		System.out.println("new url : " + someexternalservice.returnServiceURL());
		context.close();
	}
}

