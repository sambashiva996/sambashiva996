package com.springcloudapiinvoiceservice.model;

public class Product {

	private int quantity;
	private double totalAmount;
	private String orderStatus;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	@Override
	public String toString() {
		return "Product [quantity=" + quantity + ", totalAmount=" + totalAmount + ", orderStatus=" + orderStatus + "]";
	}
	
	
}
