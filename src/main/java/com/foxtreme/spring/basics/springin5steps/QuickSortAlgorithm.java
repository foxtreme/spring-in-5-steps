package com.foxtreme.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

//@Qualifier("quick")
@Component
public class QuickSortAlgorithm implements SortAlgorithm{
	
	public int [] sort(int[] numbers) {
		return numbers;
	}
}
