package com.springcloudapiorderservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springcloudapiorderservice.model.Product;

@FeignClient(name = "product-service",url = "localhost:8001")
public interface OrderFeignIntf {

	@GetMapping(value = "/product/productById/{pId}")
	Product getProductDetails(@PathVariable("pId") int pId);
	

}
