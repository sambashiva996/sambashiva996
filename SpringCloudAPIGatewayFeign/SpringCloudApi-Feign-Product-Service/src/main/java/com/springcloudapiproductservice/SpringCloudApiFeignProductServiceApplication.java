package com.springcloudapiproductservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudApiFeignProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApiFeignProductServiceApplication.class, args);
	}

}
