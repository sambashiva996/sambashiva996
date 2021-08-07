package com.petpeers.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.petpeers.model.Login;
import com.petpeers.model.Pets;
import com.petpeers.model.UserRegistration;

@Repository
public class LoginServiceDaoImpl implements LoginServiceDaoIntf{

	@Autowired
	SessionFactory sessionFactory;
	
	public List<UserRegistration> getLoginList(String userName) {
		Query loginData = sessionFactory.openSession().getNamedQuery("findLoginByUserName");
		loginData.setParameter("userName", userName);
		List<UserRegistration> listLogin = loginData.list();
		System.out.println(listLogin);
		return listLogin;
	}

}
