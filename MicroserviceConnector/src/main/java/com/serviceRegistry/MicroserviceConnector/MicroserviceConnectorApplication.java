package com.serviceRegistry.MicroserviceConnector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConnectorApplication.class, args);
	}

}
