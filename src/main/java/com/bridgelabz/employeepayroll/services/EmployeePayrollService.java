package com.bridgelabz.employeepayroll.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayroll.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayroll.model.EmployeePayrollData;

@Service 
public class EmployeePayrollService implements IEmployeePayrollService {

	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		List<EmployeePayrollData> empDataList = new ArrayList<>();
		empDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Pankaj", 30000)));
		return empDataList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Pankaj", 30000));
		return employeePayrollData;
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
		return employeePayrollData;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = new EmployeePayrollData(1, employeePayrollDTO);
		return employeePayrollData;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) { }
}
