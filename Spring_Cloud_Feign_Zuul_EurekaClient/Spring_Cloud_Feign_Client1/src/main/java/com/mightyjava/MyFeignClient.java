package com.mightyjava;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client-2")
public interface MyFeignClient {

	@GetMapping("/")
	String client2Response();

	@GetMapping("/welcome")
	String welcome();
}
