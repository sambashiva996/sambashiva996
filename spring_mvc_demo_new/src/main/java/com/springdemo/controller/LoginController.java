package com.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springdemo.model.Login;
import com.springdemo.service.LoginServiceIntf;

@Controller
public class LoginController {
	
	@Autowired
	LoginServiceIntf loginServiceIntf;
	
	@RequestMapping("/loginPage")
	public ModelAndView getLoginPage(@ModelAttribute("login") Login login) {
		
		return new ModelAndView("Login");
	}
	
	@RequestMapping("/nextPage")
	public ModelAndView nextPage(@Validated @ModelAttribute("login") Login login, BindingResult result) {
		
		if(result.hasErrors()) {
			
			return new ModelAndView("Login");

		}
		//String userName = login.getUserName();
		loginServiceIntf.saveLoginDetails(login);
		ModelAndView modelAndView = new ModelAndView("Success");
		modelAndView.addObject("user", login);
		return modelAndView;
	}

}
