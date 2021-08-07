package com.mightyjava;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="eureka-client-3")
public interface MyFeignClient {
	
	@GetMapping("/")
	String client3Response();
}
