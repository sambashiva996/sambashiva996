package com.springcloudapiproductservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springcloudapiproductservice.dao.Productrepository;
import com.springcloudapiproductservice.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductServiceIntf{
      
	@Autowired
	Productrepository productrepository;
	
	public void saveProduct(Product product) {
		productrepository.save(product);
	}

	
	public List<Product> getAllProducts() {
		return productrepository.findAll();
	}

	public Optional<Product> getProductById(int pId) {
		return productrepository.findById(pId);
	}
	
	public Product updateProduct(Product product) {
		Optional<Product> findById = productrepository.findById(product.getpId());
		
		if(findById.isPresent()) {
			return productrepository.save(product);
		}
		return product;
	}

}
