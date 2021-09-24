package com.foxtreme.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.foxtreme.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.foxtreme.spring.basics.springin5steps.cdi.SomeCDIBusiness;
import com.foxtreme.spring.basics.springin5steps.cdi.SomeCDIDAO;
import com.foxtreme.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsCdiApplication.class, args);
		SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);
		
		LOGGER.info("{} dao-{}", someCDIBusiness, someCDIBusiness.getSomeCDIDAO());

	}

}
