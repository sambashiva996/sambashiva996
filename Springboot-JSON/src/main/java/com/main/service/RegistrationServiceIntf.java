package com.main.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.model.Registration;

public interface RegistrationServiceIntf {

	public void saveRegister(Registration registration);

	public List<Registration> fetchRegistrationDetails();

	

}
