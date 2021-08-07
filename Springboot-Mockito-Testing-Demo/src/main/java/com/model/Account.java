package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_account_new")
public class Account {

	@Id
	private int accId;
	private double balance;

	public Account() {

	}

	public Account(int accId, double balance) {
		super();
		this.accId = accId;
		this.balance = balance;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String toString() {
		return "Account [accId=" + accId + ", balance=" + balance + "]";
	}

}
