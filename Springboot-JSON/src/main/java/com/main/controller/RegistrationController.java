package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Registration;
import com.main.service.RegistrationServiceIntf;

@RestController
public class RegistrationController {
	
	@Autowired
	RegistrationServiceIntf serviceIntf;
	
	@PostMapping("saveRegistration")
	public String saveRegister(@RequestBody Registration registration) {
		
		serviceIntf.saveRegister(registration);
		return "saved succesfully";
	}
	
	@GetMapping("fetchRegistration")
	public List<Registration> fetchRegistration(){
		
		List<Registration> list = serviceIntf.fetchRegistrationDetails();
		return list;
	}
	

}
