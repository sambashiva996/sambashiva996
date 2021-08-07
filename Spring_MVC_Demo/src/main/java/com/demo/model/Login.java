package com.demo.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Login {
	@NotEmpty(message="UserName should not be empty")
private String userName;
	@NotEmpty(message="Password should not be empty")
private String password;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
