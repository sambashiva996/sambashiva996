package com.springbootsecurity.service;

import java.util.List;

import com.springbootsecurity.model.Employee;

public interface EmployeeService {

	List<Employee> findAllEmployees();

}
