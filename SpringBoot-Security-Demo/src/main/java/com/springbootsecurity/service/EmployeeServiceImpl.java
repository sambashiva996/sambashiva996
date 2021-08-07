package com.springbootsecurity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootsecurity.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	static List<Employee> empList=null;
	
	static {
		empList = new ArrayList<Employee>();
		empList.add(new Employee(101,"employee1","dept1","location1"));
		empList.add(new Employee(102,"employee2","dept2","location2"));
		empList.add(new Employee(103,"employee3","dept3","location3"));
	}
	
	public List<Employee> findAllEmployees(){
		
		return empList;
	}

}
