package com.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.main.model.Order;
import com.main.repository.OrderServerRepository;
@Service
@Transactional
public class OrderServiceImpl implements OrderServiceIntf{
	
	@Autowired
	OrderServerRepository orderRepo;

	public void saveOrderDetails(Order reg1) {
		orderRepo.save(reg1);
	}

	public List<Order> fetchProductData() {
		return (List<Order>) orderRepo.findAll();
	}

	
	public void deleteOrder(int id) {
	
		 orderRepo.deleteById(id);
		
	}

	public Order getOrderById(int id) {
		
		return 	 orderRepo.getOne(id);
	}


	public Order getOneOrderById(int id) {
	
		return 	 orderRepo.findById(id).get();
	}

	

	
}
