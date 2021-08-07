package com.springcloudapiorderservice.model;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

public class OrderDto {
	
	@NotEmpty(message = "Customer Name mandatory")
	private String customerName;
	@NotEmpty(message = "Customer Address mandatory")
	private String CustomerAddress;
	@NotEmpty(message = "Order Status mandatory")
	private String orderStatus;
	private Date orderDate;
	private int pId;
	private int quantity;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
