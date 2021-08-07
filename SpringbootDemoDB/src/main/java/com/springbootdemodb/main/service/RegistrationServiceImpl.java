package com.springbootdemodb.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springbootdemodb.main.dao.RegistrationDaoIntf;
import com.springbootdemodb.main.model.Registration;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationServiceIntf{

	@Autowired
	RegistrationDaoIntf registrationDaoIntf;
	
	public void saveRegistrationDetails(Registration registration) {
		registrationDaoIntf.saveRegistrationDertails(registration);
	}
	
	public List<Registration> getListOfRegistration() {
		
		
		return registrationDaoIntf.getListOfRegistration();
	}

	public void deleteRegistrationById(int custId) {
		registrationDaoIntf.deleteRegistrationById(custId);
	}

	
	public Registration editRegistrationById(int custId) {
		return registrationDaoIntf.editRegistration(custId);
	}

	
	public void updateRegistrationById(Registration registration) {
		registrationDaoIntf.updateRegistrationById(registration);
	}

}
