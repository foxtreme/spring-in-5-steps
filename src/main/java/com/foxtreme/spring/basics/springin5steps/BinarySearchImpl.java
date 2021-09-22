package com.foxtreme.spring.basics.springin5steps;

public class BinarySearchImpl {

	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int [] sortedNumbers = this.sortAlgorithm.sort(numbers);
		return 3;
	}
	
}
