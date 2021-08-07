package com.springbootdemodb.main.service;

import java.util.List;

import com.springbootdemodb.main.model.Registration;

public interface RegistrationServiceIntf {

	void saveRegistrationDetails(Registration registration);

	List<Registration> getListOfRegistration();

	void deleteRegistrationById(int custId);

	Registration editRegistrationById(int custId);

	void updateRegistrationById(Registration registration);

}
