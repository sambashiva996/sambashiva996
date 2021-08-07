package com.springcloudapiorderservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcloudapiorderservice.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
