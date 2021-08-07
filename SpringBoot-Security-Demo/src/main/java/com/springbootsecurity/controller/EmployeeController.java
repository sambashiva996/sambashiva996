package com.springbootsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootsecurity.model.Employee;
import com.springbootsecurity.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		
		return service.findAllEmployees();
      }
	
	@GetMapping("/404")
	public String accessDeniedPage() {
		
		return "You Can not Access This Page";
	}

}
