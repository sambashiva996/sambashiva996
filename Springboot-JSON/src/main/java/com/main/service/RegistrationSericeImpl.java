package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.dao.RegistrationRepository;
import com.main.model.Registration;

@Service
@Transactional
public class RegistrationSericeImpl implements RegistrationServiceIntf{

	@Autowired
	RegistrationRepository repo;
	
	public void saveRegister(Registration registration) {
		
		repo.save(registration);
	}
	public List<Registration> fetchRegistrationDetails() {
		
		return repo.findAll();
	}

}
