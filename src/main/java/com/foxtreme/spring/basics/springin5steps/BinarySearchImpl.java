package com.foxtreme.spring.basics.springin5steps;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	//@Qualifier("quick")
	private SortAlgorithm quickSortAlgorithm; //autowiring by name

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int [] sortedNumbers = this.quickSortAlgorithm.sort(numbers);
		System.out.println(quickSortAlgorithm);
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		LOGGER.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		LOGGER.info("preDestroy");
	}
}
