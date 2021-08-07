package com.springcloudapiproductservice.dto;

import javax.validation.constraints.NotEmpty;

public class ProductDto {

	@NotEmpty(message = "Product Name Mandatory")
	private String pName;
	@NotEmpty(message = "Product Category Mandatory")
	private String pCategory;
	@NotEmpty(message = "Product Description Mandatory")
	private String pDescription;
	private double pPrice;
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCategory() {
		return pCategory;
	}
	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}
	public String getpDescription() {
		return pDescription;
	}
	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	
	
}
