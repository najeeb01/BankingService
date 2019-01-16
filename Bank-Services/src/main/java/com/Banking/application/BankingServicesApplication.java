package com.Banking.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
(scanBasePackages={"com.Banking"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class BankingServicesApplication extends SpringBootServletInitializer {

	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(BankingServicesApplication.class);
	 }
	 
	/*public static void main(String[] args) {
		SpringApplication.run(BankingServicesApplication.class, args);*/
	}
