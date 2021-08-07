package com.petpeers.service;

import java.util.List;

import com.petpeers.model.Login;
import com.petpeers.model.Pets;
import com.petpeers.model.UserRegistration;

public interface LoginServiceIntf {

	List<UserRegistration> getLoginList(String userName);
}
