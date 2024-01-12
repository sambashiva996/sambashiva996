package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableCircuitBreaker
@EnableEurekaClient    
@EnableZuulProxy
@SpringBootApplication
public class ZuulServiceApplication {

	public static void main(String[] args) {
		 SpringApplication.run(ZuulServiceApplication.class, args);

	}

}
