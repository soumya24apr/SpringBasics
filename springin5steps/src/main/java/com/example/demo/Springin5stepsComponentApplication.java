package com.example.demo;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.componentscan.PersonDAO;


@SpringBootApplication
@ComponentScan("com.example.componentscan")
public class Springin5stepsComponentApplication {

	private static Logger logger = LoggerFactory.getLogger(Springin5stepsComponentApplication.class);
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springin5stepsComponentApplication.class, args);
		PersonDAO persondao = context.getBean(PersonDAO.class);
		PersonDAO persondao1 = context.getBean(PersonDAO.class);
		logger.info("{}",persondao);
		logger.info("{}",persondao.getJdbcconn());
		
		logger.info("{}",persondao1);
		logger.info("{}",persondao1.getJdbcconn());
	}
}

