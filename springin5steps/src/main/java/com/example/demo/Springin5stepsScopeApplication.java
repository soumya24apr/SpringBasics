package com.example.demo;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.scope.PersonDAO;

@SpringBootApplication
public class Springin5stepsScopeApplication {

	private static Logger logger = LoggerFactory.getLogger(Springin5stepsScopeApplication.class);
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springin5stepsScopeApplication.class, args);
		PersonDAO persondao = context.getBean(PersonDAO.class);
		PersonDAO persondao1 = context.getBean(PersonDAO.class);
		logger.info("{}",persondao);
		logger.info("{}",persondao.getJdbcconn());
		
		logger.info("{}",persondao1);
		logger.info("{}",persondao1.getJdbcconn());
	}
}

