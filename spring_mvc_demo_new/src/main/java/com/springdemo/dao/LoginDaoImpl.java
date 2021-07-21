package com.springdemo.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springdemo.model.Login;

@Repository
public class LoginDaoImpl implements LoginDaoIntf{

	@Autowired
	SessionFactory sessionFactory;
	public void saveLoginDetails(Login login) {
		sessionFactory.openSession().save(login);
		
	}

}
