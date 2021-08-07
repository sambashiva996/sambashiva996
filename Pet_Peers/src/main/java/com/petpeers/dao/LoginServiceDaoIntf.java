package com.petpeers.dao;

import java.util.List;

import com.petpeers.model.Login;
import com.petpeers.model.Pets;
import com.petpeers.model.UserRegistration;

public interface LoginServiceDaoIntf {

	List<UserRegistration> getLoginList(String userName);

}
