package com.cloud.server.benefitslocalconf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BenefitsLocalConfApplication {

	public static void main(String[] args) {
		SpringApplication.run(BenefitsLocalConfApplication.class, args);
	}

}
