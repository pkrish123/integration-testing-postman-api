package com.example.integration.testing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.integration.testing.repositories") 
@EntityScan("com.example.integration.testing.entities")
@SpringBootApplication
public class IntegrationTestingSampleApiApplication {
	
	final static Logger log = LoggerFactory.getLogger(IntegrationTestingSampleApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(IntegrationTestingSampleApiApplication.class, args);
		log.info("Started Application on port:");
	}

}
