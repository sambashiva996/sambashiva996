package com.hibernatedemo.model;

public class Employee {
	
	private int id;
	private int age;
	private String firstName;
	private String lastName;
	private String Address;
	private String Email;
	
	
	public Employee() {
		super();
	}
	public Employee(int age, String firstName, String lastName, String address, String email) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		Address = address;
		Email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", Address=" + Address + ", Email=" + Email + "]";
	}
	
	

}
