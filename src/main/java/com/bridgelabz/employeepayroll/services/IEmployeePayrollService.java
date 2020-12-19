package com.bridgelabz.employeepayroll.services;

import java.util.List;

import com.bridgelabz.employeepayroll.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayroll.model.EmployeePayrollData;

public interface IEmployeePayrollService {
	
	List<EmployeePayrollData> getEmployeePayrollData();
	
	EmployeePayrollData getEmployeePayrollDataById(int empId);
	
	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);
	
	EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);
	
	void deleteEmployeePayrollData(int empId);
}
