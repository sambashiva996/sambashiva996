package com.springcloudapiproductservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcloudapiproductservice.model.Product;

@Repository
public interface Productrepository extends JpaRepository<Product, Integer>{

	
}
