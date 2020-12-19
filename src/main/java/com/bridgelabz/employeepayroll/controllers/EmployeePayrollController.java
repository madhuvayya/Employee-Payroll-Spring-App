package com.bridgelabz.employeepayroll.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayroll.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayroll.dto.ResponseDTO;
import com.bridgelabz.employeepayroll.model.EmployeePayrollData;
import com.bridgelabz.employeepayroll.services.IEmployeePayrollService;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {
	
	@Autowired
	private IEmployeePayrollService employeePayrollService; 

	@RequestMapping(value = {"","/","/get"})
	public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
		List<EmployeePayrollData> empDataList = null;
		empDataList = employeePayrollService.getEmployeePayrollData();
		ResponseDTO responseDTO = new ResponseDTO("Get call successfully", empDataList); 
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId){
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = employeePayrollService.getEmployeePayrollDataById(empId);
		ResponseDTO responseDTO = new ResponseDTO("Get call For Id Successfull", employeePayrollData); 
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = employeePayrollService.createEmployeePayrollData(empPayrollDTO);
		ResponseDTO responseDTO = new ResponseDTO("Created Employee Payroll Data Successfully:", employeePayrollData); 
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO) {
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = employeePayrollService.updateEmployeePayrollData(empPayrollDTO);
		ResponseDTO responseDTO = new ResponseDTO("Updated Employee Payroll Data Successfully:", employeePayrollData); 
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
		employeePayrollService.deleteEmployeePayrollData(empId);
		ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully:", "Deleted Id: "+ empId); 
		return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
	}
}
