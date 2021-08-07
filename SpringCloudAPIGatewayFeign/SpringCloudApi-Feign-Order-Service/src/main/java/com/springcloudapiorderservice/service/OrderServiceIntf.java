package com.springcloudapiorderservice.service;

import java.util.List;
import java.util.Optional;

import com.springcloudapiorderservice.model.Order;

public interface OrderServiceIntf {

	void saveOrder(Order order);

	List<Order> fetchOrder();

	Optional<Order> getOrderById(int orderId);
}
