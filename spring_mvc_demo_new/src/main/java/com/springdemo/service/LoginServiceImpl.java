package com.springdemo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.dao.LoginDaoIntf;
import com.springdemo.model.Login;

@Service
@Transactional
public class LoginServiceImpl  implements LoginServiceIntf{

	@Autowired
	LoginDaoIntf loginDaoIntf;
	public void saveLoginDetails(Login login) {
		loginDaoIntf.saveLoginDetails(login);
	}

}
