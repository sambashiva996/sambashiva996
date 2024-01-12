package com.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tblOrder")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private String custName;
	private String custAddr;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date orderDate;
	private String orderStatus;
	private int productId;
	private int quantity;
	
	
	public Order(int orderId, String custName, String custAddr, Date orderDate, String orderStatus, int productId,
			int quantity) {
		super();
		this.orderId = orderId;
		this.custName = custName;
		this.custAddr = custAddr;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.productId = productId;
		this.quantity = quantity;
	}
	
	
	public String toString() {
		return "Order [orderId=" + orderId + ", custName=" + custName + ", custAddr=" + custAddr + ", orderDate="
				+ orderDate + ", orderStatus=" + orderStatus + ", productId=" + productId + ", quantity=" + quantity
				+ "]";
	}
	public Order() {
		
	}

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
