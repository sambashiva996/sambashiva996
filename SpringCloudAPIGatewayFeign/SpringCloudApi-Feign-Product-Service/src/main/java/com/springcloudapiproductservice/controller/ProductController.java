package com.springcloudapiproductservice.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloudapiproductservice.dto.ProductDto;
import com.springcloudapiproductservice.model.Product;
import com.springcloudapiproductservice.service.ProductServiceIntf;

@RestController
@RequestMapping("/product")
@Validated
public class ProductController {
	
	@Autowired
	ProductServiceIntf productServiceIntf;
	
	
	@PostMapping("/saveProduct")
	public ResponseEntity<String> saveProduct(@Valid @RequestBody ProductDto products){
		
		Product product = new Product();
     product.setpName(products.getpName());
     product.setpCategory(products.getpCategory());
     product.setpDescription(products.getpDescription());
     product.setpPrice(products.getpPrice());
		              
		productServiceIntf.saveProduct(product);
		
		return new ResponseEntity<String>("product saved successfully",HttpStatus.CREATED);
	}
	
	@GetMapping("/fetchProducts")
	public ResponseEntity<List<Product>> getAllProducts(){
		
		List<Product> listOfProducts = productServiceIntf.getAllProducts();
		
		if(listOfProducts.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Product>>(listOfProducts,HttpStatus.OK);
	}
	
	@GetMapping("/product/{pId}")
	public ResponseEntity<Optional<Product>> getProductById(@PathVariable("pId") int pId){
		
		Optional<Product> product = productServiceIntf.getProductById(pId);
		if(product.isPresent()) {
			return new ResponseEntity<Optional<Product>>(product,HttpStatus.OK);

		}
		return new ResponseEntity<Optional<Product>>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/productById/{pId}")
	public Product getProductDetails(@PathVariable("pId") int pId){
		
		Product product = productServiceIntf.getProductById(pId).get();
		System.out.println("product=="+product);
		if(product !=null) {
			return product;

		}
		return product;
	}
	
	@PutMapping("/updateProduct")
	public ResponseEntity<String> updateProduct(@RequestBody Product product){
		if(productServiceIntf.updateProduct(product) !=null) {
			return new ResponseEntity<String>("Updated successfully",HttpStatus.OK);

		}
		return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		
	}
	

}
