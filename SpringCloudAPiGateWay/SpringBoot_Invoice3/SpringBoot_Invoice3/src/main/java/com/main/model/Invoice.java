package com.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int invoiceid;
	@Override
	public String toString() {
		return "Invoice [invoiceid=" + invoiceid + ", totalamount=" + totalamount + ", paymentstatus=" + paymentstatus
				+ "]";
	}
	public int getInvoiceid() {
		return invoiceid;
	}
	public void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
	}
	public int getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(int totalamount) {
		this.totalamount = totalamount;
	}
	public Invoice() {
		super();
	}
	public Invoice(int invoiceid, int totalamount, String paymentstatus) {
		super();
		this.invoiceid = invoiceid;
		this.totalamount = totalamount;
		this.paymentstatus = paymentstatus;
	}
	public String getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(String paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	private int totalamount;
	private String paymentstatus;
	private int order_id;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	
}
