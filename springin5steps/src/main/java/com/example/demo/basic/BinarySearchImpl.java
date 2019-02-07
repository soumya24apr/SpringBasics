package com.example.demo.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

	private Logger logger = LoggerFactory.getLogger(BinarySearchImpl.class); 
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortalgo;
	
	public int binarySearch(int[] number,int numbertoSearchfor){
		int[] sortNumbers = sortalgo.sort(number); 
		System.out.println("-------------------" + sortalgo);
		return 3;
	}
	
	@PostConstruct
	public void postConstruct(){
		logger.info("----------- Post Construct");
	}
	
	@PreDestroy
	public void preConstruct(){
		logger.info("----------- pre destroy");
	}
}
