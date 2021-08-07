package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Login;

@Controller
public class LoginController {//ctrl+shift+o
@RequestMapping("/loadLoginPage")
public ModelAndView loadLoginPage(@ModelAttribute("login") Login login)
{
	
	return new ModelAndView("Login");
}
@RequestMapping("/nextPage")
public ModelAndView nextPage(@Validated @ModelAttribute("login") Login login,BindingResult result)
{
	if(result.hasErrors())
	{
		return new ModelAndView("Login");
	}
	String username=login.getUserName();
	return new ModelAndView("Success","user",username);
}
}
