package com.springbootdemodb.main.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbootdemodb.main.model.Registration;

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

	public void deleteRegistrationById(int custId) {
		System.out.println("deletdid== "+custId);
		Session session = sessionFactory.getCurrentSession();
		Registration registration = session.load(Registration.class, new Integer(custId));
		
		if(registration != null) {
			session.delete(registration);
		}
		
	}

	
	public Registration editRegistration(int custId) {
	Session session = sessionFactory.getCurrentSession();
	Registration registration = session.get(Registration.class, new Integer(custId));
		return registration;

	}

	
	public void updateRegistrationById(Registration registration) {
		Session session = sessionFactory.getCurrentSession();
		session.update(registration);
	}
	}
