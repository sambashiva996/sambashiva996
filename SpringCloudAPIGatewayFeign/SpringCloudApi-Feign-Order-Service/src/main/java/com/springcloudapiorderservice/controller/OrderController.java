package com.springcloudapiorderservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloudapiorderservice.feign.OrderFeignIntf;
import com.springcloudapiorderservice.model.Order;
import com.springcloudapiorderservice.model.OrderDto;
import com.springcloudapiorderservice.model.Product;
import com.springcloudapiorderservice.service.OrderServiceIntf;

@RestController
@RequestMapping("/order")
@Validated
public class OrderController {
	
	@Autowired
	OrderServiceIntf orderServiceIntf;
	@Autowired
	OrderFeignIntf orderFeignItf;
	
	@PostMapping("/createOrder")
	public ResponseEntity<String> createOrder(@Valid @RequestBody OrderDto orders){
		
		Order order = new Order();
		
		order.setCustomerName(orders.getCustomerName());
		order.setCustomerAddress(orders.getCustomerAddress());
		order.setOrderStatus(orders.getOrderStatus());
		order.setDate(orders.getOrderDate());
		order.setpId(orders.getpId());
		order.setQuantity(orders.getQuantity());
		
		orderServiceIntf.saveOrder(order);
		return new ResponseEntity<String>("Order Created Succussfully with ",HttpStatus.CREATED);
	}
	
	@GetMapping("/fetchOrders")
	public ResponseEntity<List<Order>> fetchOrder(){
		
		List<Order> listOfOrder = orderServiceIntf.fetchOrder();
		if(listOfOrder.isEmpty()) {
			return new ResponseEntity<List<Order>>(HttpStatus.NO_CONTENT);

		}
		return new ResponseEntity<List<Order>>(listOfOrder,HttpStatus.OK);
	}
	
	@GetMapping("/order/{orderId}")
	public ResponseEntity<Optional<Order>> getOrderById(@PathVariable("orderId") int orderId){
		Optional<Order> orderById = orderServiceIntf.getOrderById(orderId);
		if(orderById.isPresent()) {
			return new ResponseEntity<Optional<Order>>(orderById,HttpStatus.OK);

		}
		return new ResponseEntity<Optional<Order>>(HttpStatus.NO_CONTENT);
    }
	
	@GetMapping("/orderById/{orderId}")
	public ArrayList getOrderDetails(@PathVariable("orderId") int orderId) throws JSONException{
		System.out.println("orderId=="+orderId);
		Order orderById = orderServiceIntf.getOrderById(orderId).get();
		
		System.out.println("orderById=="+orderById);
		int pId = orderById.getpId();
		
		Product product = orderFeignItf.getProductDetails(pId);
		
		System.out.println("orderproduct=="+product);
		ArrayList orderProduct = new ArrayList();
		int orderId2 = orderById.getOrderId();
		double getpPrice = product.getpPrice();
		int quantity = orderById.getQuantity();
		String orderStatus = orderById.getOrderStatus();
		orderProduct.add(getpPrice);
		orderProduct.add(quantity);
		orderProduct.add(orderStatus);
		orderProduct.add(orderId2);
		return orderProduct;
    }

}
