package com.foxtreme.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm quickSortAlgorithm;

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		this.quickSortAlgorithm.sort(numbers);
		System.out.println(quickSortAlgorithm);
		return 3;
	}
	
}
