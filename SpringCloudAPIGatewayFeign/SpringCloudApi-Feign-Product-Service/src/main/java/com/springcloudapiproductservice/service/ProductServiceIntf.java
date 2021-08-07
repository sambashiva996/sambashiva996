package com.springcloudapiproductservice.service;

import java.util.List;
import java.util.Optional;

import com.springcloudapiproductservice.model.Product;

public interface ProductServiceIntf {

	void saveProduct(Product product);

	List<Product> getAllProducts();

	Optional<Product> getProductById(int pId);

	Product updateProduct(Product product);
	
	

}
