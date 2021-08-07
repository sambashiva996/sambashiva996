package com.springcloudapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudApiFeignEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApiFeignEurekaApplication.class, args);
	}

}
