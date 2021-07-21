package com.springhibernatedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springhibernatedemo.model.Registration;
import com.springhibernatedemo.service.RegistrationServiceIntf;

@Controller
public class RegistrationController {
	
	@Autowired
	RegistrationServiceIntf registrationServiceIntf;
	
	@RequestMapping("/registrationPage")
	public ModelAndView getRegistrationPage(@ModelAttribute("registration") Registration registration) {
		
		return new ModelAndView("Registration");
		
	}

	@RequestMapping("/nextPage")
	public ModelAndView nextPage(@Validated @ModelAttribute("registration") Registration registration,BindingResult result) {
		
		if(result.hasErrors()) {
			new ModelAndView("Registration");
		}
		
		registrationServiceIntf.saveRegistrationDetails(registration);
		
		ModelAndView modelAndView = new ModelAndView("redirect:/fetchRegisterDetails");
		//modelAndView.addObject("registration" ,registration);
		return modelAndView;
		
	}
	
	@RequestMapping("/fetchRegisterDetails")
	public ModelAndView fetchRegisterDetails(){
		
		List<Registration> listOfRegistration = registrationServiceIntf.getListOfRegistration();
		
		return new ModelAndView("RegistrationSuccess", "registerDeatails" ,listOfRegistration);
		
	}
}
