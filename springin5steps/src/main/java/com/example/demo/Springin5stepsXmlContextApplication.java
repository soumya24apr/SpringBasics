package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.xml.XMLPersonDAO;

public class Springin5stepsXmlContextApplication {

	private static Logger logger = LoggerFactory.getLogger(Springin5stepsXmlContextApplication.class);
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		XMLPersonDAO xmlpersondao = context.getBean(XMLPersonDAO.class);
		System.out.println("{}" + xmlpersondao);
		context.close();
	}
}

