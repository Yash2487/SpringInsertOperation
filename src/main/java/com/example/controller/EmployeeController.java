package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {

	// Inject the EmployeeService here
	@Autowired
	private EmployeeService employeeService;

	// Design Restful web service to save/insert employee data into database
	@PostMapping("/saveEmployeeData")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		// call saveEmployee method by using object of employeeService
		Employee emp = employeeService.saveEmployee(employee);
		return ResponseEntity.ok().body(emp);
	}

}
