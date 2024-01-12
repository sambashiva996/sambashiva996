package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.main.model.Order;
import com.main.service.OrderServiceIntf;


@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderServiceIntf orderSer;

	@PostMapping("/saveOrder")
	public ResponseEntity<String> saveRegister(@RequestBody Order reg1) {
		orderSer.saveOrderDetails(reg1);
		return new ResponseEntity<String>("Order Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/order/{id}")
	public ResponseEntity<Order> getOneOrderById(@PathVariable("id") int id) {
		Order order = orderSer.getOneOrderById(id);
		if (order != null) {
			return new ResponseEntity<Order>(order,HttpStatus.OK);
		}
		return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping("/getOrder")
	public ResponseEntity<List<Order>> fetchData() {
		List<Order> list = orderSer.fetchProductData();
		if (list.size() == 0) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@DeleteMapping(value = "/order/{id}")
	private ResponseEntity<String> deleteOrder(@PathVariable("id") int id) {
		Order order = orderSer.getOrderById(id);

		if (order != null) {
			try {
				orderSer.deleteOrder(id);
				return new ResponseEntity<String>("deleted successfully",HttpStatus.OK);
			} catch (Exception e) {
				e.printStackTrace();
				return new ResponseEntity<String>("order not found ",

						HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<String>("order  found",HttpStatus.NOT_FOUND);
	}
}
