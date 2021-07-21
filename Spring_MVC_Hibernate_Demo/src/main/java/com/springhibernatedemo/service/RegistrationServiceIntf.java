package com.springhibernatedemo.service;

import java.util.List;

import com.springhibernatedemo.model.Registration;

public interface RegistrationServiceIntf {

	void saveRegistrationDetails(Registration registration);

	List<Registration> getListOfRegistration();

}
