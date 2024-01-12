package com.main;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "eureka-client-2")
public interface MyFeignClient {


	String client2Response();
	
	@GetMapping(value="/products/{id}")
	JSONObject getOneProductById(@PathVariable("id") long id);
	
	
	
}
