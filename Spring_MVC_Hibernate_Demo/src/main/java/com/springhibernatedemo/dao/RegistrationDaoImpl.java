package com.springhibernatedemo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springhibernatedemo.model.Registration;

@Repository
public class RegistrationDaoImpl implements RegistrationDaoIntf{

	@Autowired
	SessionFactory sessionFactory;
	
	public void saveRegistrationDertails(Registration registration) {
		sessionFactory.openSession().save(registration);
	}
	
	public List<Registration> getListOfRegistration() {
		
		Query query = sessionFactory.openSession().createQuery("from Registration");
		List<Registration> listOfRegistration = query.list();
		return listOfRegistration;
	}

}
