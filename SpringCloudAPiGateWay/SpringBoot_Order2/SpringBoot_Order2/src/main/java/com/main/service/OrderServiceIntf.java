package com.main.service;

import java.util.List;

import com.main.model.Order;

public interface OrderServiceIntf {

	void saveOrderDetails(Order reg1);

	List<Order> fetchProductData();

	void deleteOrder(int id);

	Order getOrderById(int id);

	Order getOneOrderById(int id);


}
