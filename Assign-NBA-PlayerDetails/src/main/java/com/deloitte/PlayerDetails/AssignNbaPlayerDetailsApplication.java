package com.deloitte.PlayerDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class AssignNbaPlayerDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignNbaPlayerDetailsApplication.class, args);
	}

}
