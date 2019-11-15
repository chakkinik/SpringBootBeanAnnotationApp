package com.puru.customBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public Employee getEmployee() {
		return new Employee(1,"puru");
	}

}
