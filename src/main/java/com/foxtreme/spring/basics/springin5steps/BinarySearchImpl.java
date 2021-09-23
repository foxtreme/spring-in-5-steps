package com.foxtreme.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	//@Qualifier("quick")
	private SortAlgorithm quickSortAlgorithm; //autowiring by name

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int [] sortedNumbers = this.quickSortAlgorithm.sort(numbers);
		System.out.println(quickSortAlgorithm);
		return 3;
	}
	
}
