package com.example.demo.Service;

import com.example.demo.DTO.EmployeeDTO;
import com.example.demo.DTO.LoginDTO;
import com.example.demo.Entity.Employee;
import com.example.demo.Response.LoginMesage;
 

public interface EmployeeService {
	 
    LoginMesage loginEmployee(LoginDTO loginDTO);

	String addEmployee(EmployeeDTO employeeDTO);

}
