package com.petpeers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.petpeers.model.UserRegistration;
import com.petpeers.service.LoginServiceIntf;
import com.petpeers.service.RegistrationSeviceIntf;

@Controller
public class RegistrationController {
	
	@Autowired
	RegistrationSeviceIntf registrationServiceIntf;
	@Autowired
	LoginServiceIntf loginServiceIntf;
	
	@RequestMapping("/registrationPage")
	public ModelAndView loadRegistrationPage(@ModelAttribute("registration") UserRegistration registration) {
		
		
		return new ModelAndView("Registration");
	}
	
	@RequestMapping("/currentPage")
	public ModelAndView getRegistrationPage(@Validated @ModelAttribute("registration") UserRegistration registration,BindingResult result) {
		
		if(result.hasErrors()) {
			return new ModelAndView("Registration");
		}
		String userName = registration.getUserName();
		
	    List<UserRegistration> loginList = loginServiceIntf.getLoginList(userName);
	    
	    if(loginList.size() > 0 && userName.equals(loginList.get(0).getUserName())) {
	    	
			return new ModelAndView("Registration","registered","*Already UserName is Registered!!!!");

	    }
		if(registration.getPassword().equals(registration.getCpassword())) {
			
//			registration.setUserName(Base64.getEncoder().encodeToString(registration.getUserName().getBytes()));
//			registration.setPassword(Base64.getEncoder().encodeToString(registration.getPassword().getBytes()));

			registrationServiceIntf.saveRegistrationDetails(registration);
        }
	    else {
	    	
		return new ModelAndView("Registration","register","Password and Confim Password Must Be Same");
	  }
	return new ModelAndView("Registration", "register","SuccessFully Registered");

	}

}
