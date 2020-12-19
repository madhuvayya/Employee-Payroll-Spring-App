package com.bridgelabz.employeepayroll.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<String> getEmployeePayrollData() {
		return new ResponseEntity<String>("Get call success", HttpStatus.OK);
	}
}
