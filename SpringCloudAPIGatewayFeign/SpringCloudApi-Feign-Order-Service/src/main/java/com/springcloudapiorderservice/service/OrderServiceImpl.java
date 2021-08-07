package com.springcloudapiorderservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springcloudapiorderservice.dao.OrderRepository;
import com.springcloudapiorderservice.model.Order;

@Service
@Transactional
public class OrderServiceImpl implements OrderServiceIntf{

	@Autowired
	OrderRepository orderRepository;
	
	public void saveOrder(Order order) {
		orderRepository.save(order);
	}

	public List<Order> fetchOrder() {
		return orderRepository.findAll();
	}

	public Optional<Order> getOrderById(int orderId) {
		return orderRepository.findById(orderId);		
	}

}
