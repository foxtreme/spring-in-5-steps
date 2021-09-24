package com.foxtreme.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.foxtreme.spring.basics.springin5steps.cdi.SomeCDIBusiness;


@Configuration
@ComponentScan("com.foxtreme.spring.basics.springin5steps")
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
	
	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class)) {
			SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);
			LOGGER.info("{} dao-{}", someCDIBusiness, someCDIBusiness.getSomeCDIDAO());
		}
	}

}
