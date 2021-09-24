package com.foxtreme.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.foxtreme.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.foxtreme.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class)){
			BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearchImpl2 = applicationContext.getBean(BinarySearchImpl.class);
			int result = binarySearchImpl.binarySearch(new int[] {12, 4, 6}, 3);
			System.out.println(result);
			System.out.println(binarySearchImpl);
			System.out.println(binarySearchImpl2);
		}
	}

}
