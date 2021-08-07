package com.springbootdemodb.main.dao;

import java.util.List;

import com.springbootdemodb.main.model.Registration;

public interface RegistrationDaoIntf {

	void saveRegistrationDertails(Registration registration);

	List<Registration> getListOfRegistration();

	void deleteRegistrationById(int custId);

	Registration editRegistration(int custId);

	void updateRegistrationById(Registration registration);

}
