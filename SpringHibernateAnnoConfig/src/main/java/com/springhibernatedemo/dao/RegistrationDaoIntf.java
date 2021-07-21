package com.springhibernatedemo.dao;

import java.util.List;

import com.springhibernatedemo.model.Registration;

public interface RegistrationDaoIntf {

	void saveRegistrationDertails(Registration registration);

	List<Registration> getListOfRegistration();

}
