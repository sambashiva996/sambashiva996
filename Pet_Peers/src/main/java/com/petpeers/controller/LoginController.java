package com.petpeers.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.petpeers.model.Login;
import com.petpeers.model.Pets;
import com.petpeers.model.UserRegistration;
import com.petpeers.service.LoginServiceIntf;
import com.petpeers.service.PetServiceIntf;

@Controller
public class LoginController {
	
	@Autowired
	LoginServiceIntf loginServiceIntf;
	@Autowired
	PetServiceIntf petServiceIntf;
	
	@RequestMapping("/")
	public ModelAndView loadLoginPage(@ModelAttribute("login") Login login) {
		//login.setUserName("samba");
		return new ModelAndView("Login");
	}
	
	
	@RequestMapping("/loginPage")
	public ModelAndView getLogin(@Validated @ModelAttribute("login") UserRegistration login, BindingResult result,HttpSession httpSession) {
		
		if(result.hasErrors()) {
			new ModelAndView("Login");
		}
		String userName = login.getUserName();
//		String userName = new String(Base64.getDecoder().decode(login.getUserName().getBytes()));
//		String password = new String(Base64.getDecoder().decode(login.getPassword().getBytes()));

	    List<UserRegistration> loginList = loginServiceIntf.getLoginList(userName);
	    
	    if(loginList.size() > 0) {
	    if(userName.equals(loginList.get(0).getUserName())) {
	    	if(login.getPassword().equals(loginList.get(0).getPassword())) {
	    		httpSession.setAttribute("username",userName);
	    		httpSession.setAttribute("userid",loginList.get(0).getUserId());
	    		return new ModelAndView("redirect:/petHomePage");
	    	}
	    }
	    }
    	return new ModelAndView("Login","invalidLogin","Invalid User Name or Password");

	}
	
	@RequestMapping("/petHomePage")
	public ModelAndView getPetHomePage(HttpSession httpSession) {
		int userid = (int)httpSession.getAttribute("userid");
		List<Pets> petList = petServiceIntf.getPetList(userid);
		String username = (String)httpSession.getAttribute("username");
		ModelAndView modelAndView = new ModelAndView("PetHomePage","listOfPet",petList);
		modelAndView.addObject(username);
		return modelAndView;
	}
	
	@RequestMapping("/logout")
	public ModelAndView loadLogout(HttpSession httpSession) {
		httpSession.removeAttribute("username");
		httpSession.removeAttribute("userid");
		return new ModelAndView("Logout","logout","Logout Successfully!!!");
	}

}
