package com.luv2code.springboot.cruddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EnableAutoConfiguration
@SpringBootApplication
@EntityScan(basePackages = {"com.luv2code.springboot.cruddemo.entity"})
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

}
