package com.springbootdemodb.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springbootdemodb.main.model.Registration;
import com.springbootdemodb.main.service.RegistrationServiceIntf;

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
		System.out.println("registration=="+registration);
		if(result.hasErrors()) {
			new ModelAndView("Registration");
		}else {
			if(registration.getCustId() == 0) {
				registrationServiceIntf.saveRegistrationDetails(registration);
			}
			else {
				registrationServiceIntf.updateRegistrationById(registration);

			}
		}
		
		
		ModelAndView modelAndView = new ModelAndView("redirect:/fetchRegisterDetails");
		//modelAndView.addObject("registration" ,registration);
		return modelAndView;
		
	}
	
	@RequestMapping("/fetchRegisterDetails")
	public ModelAndView fetchRegisterDetails(){
		
		List<Registration> listOfRegistration = registrationServiceIntf.getListOfRegistration();
		
		return new ModelAndView("RegistrationSuccess", "registerDeatails" ,listOfRegistration);
		
	}
	
	@RequestMapping("/deletePage/{custId}")
	public ModelAndView deletePage(@PathVariable int custId) {
		registrationServiceIntf.deleteRegistrationById(custId);
			
		return new ModelAndView("redirect:/fetchRegisterDetails");
		
	}
	@RequestMapping("/editPage/{custId}")
	public ModelAndView editPage(@ModelAttribute("registration") Registration registration ,@PathVariable int custId) {
		System.out.println("Cust ........ID"+custId);
		Registration editRegistrationById = registrationServiceIntf.editRegistrationById(custId);
			System.out.println("editRegistrationById=="+editRegistrationById);
		return new ModelAndView("Registration","registration",editRegistrationById);
		
	}
}
