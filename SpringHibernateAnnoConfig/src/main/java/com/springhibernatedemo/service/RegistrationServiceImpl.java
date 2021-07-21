package com.springhibernatedemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springhibernatedemo.dao.RegistrationDaoIntf;
import com.springhibernatedemo.model.Registration;

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

}
