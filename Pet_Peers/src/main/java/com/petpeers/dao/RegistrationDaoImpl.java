package com.petpeers.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.petpeers.model.UserRegistration;

@Repository
public class RegistrationDaoImpl implements RegistrationDaoIntf{
    
	@Autowired
	SessionFactory sessionFactory;
	
	public void saveRegistrationDetails(UserRegistration registration) {
		sessionFactory.openSession().save(registration);
	}

}
