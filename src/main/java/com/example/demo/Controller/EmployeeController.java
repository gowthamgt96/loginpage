package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.DTO.LoginDTO;
import com.example.demo.Response.LoginMesage;
import com.example.demo.Service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/employee")

public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@PostMapping(path = "/save")
	public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
	{
		String id=employeeservice.addEmployee(employeeDTO);
		return id;
		
	}
	
	@PostMapping(path = "/login")
	public ResponseEntity<?> LoginEmployee(@RequestBody LoginDTO loginDTO)
	{
		LoginMesage loginresponse=employeeservice.loginEmployee(loginDTO);
		return ResponseEntity.ok(loginresponse);
	}

}
