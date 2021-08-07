package com.petpeers.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petpeers.dao.RegistrationDaoIntf;
import com.petpeers.model.UserRegistration;

@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationSeviceIntf{

	@Autowired
	RegistrationDaoIntf registrationDaoIntf;
	
	public void saveRegistrationDetails(UserRegistration registration) {
		registrationDaoIntf.saveRegistrationDetails(registration);
	}

}
