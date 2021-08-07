package com.springcloudapiinvoiceservice.feign;

import java.util.ArrayList;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springcloudapiinvoiceservice.model.Order;
import com.springcloudapiinvoiceservice.model.Product;

@FeignClient(name = "order-service",url = "localhost:8002")
public interface InvoiceFeignIntf {

	@GetMapping(value = "/order/orderById/{orderId}")
	ArrayList getOrderDetails(@PathVariable("orderId") int orderId);
	
	

}
