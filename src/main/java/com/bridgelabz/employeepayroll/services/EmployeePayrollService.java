package com.bridgelabz.employeepayroll.services;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.employeepayroll.exceptions.EmployeePayrollException;
import com.bridgelabz.employeepayroll.repository.EmployeePayrollRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayroll.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayroll.model.EmployeePayrollData;

@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService {

	@Autowired
	private EmployeePayrollRepository employeePayrollRepository;

	private List<EmployeePayrollData> empPayrollList = new ArrayList<>();

	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		return empPayrollList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		return empPayrollList.stream()
				.filter(list -> list.getEmployeeId()==empId)
				.findFirst()
				.orElseThrow(() -> new EmployeePayrollException("Employee not present"));
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = new EmployeePayrollData(employeePayrollDTO);
		empPayrollList.add(employeePayrollData);
		log.debug("Employee Data:" + employeePayrollData.toString());
		return employeePayrollRepository.save(employeePayrollData);
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empId);
		employeePayrollData.setName(employeePayrollDTO.name);
		employeePayrollData.setSalary(employeePayrollDTO.salary);
		empPayrollList.set(empId-1, employeePayrollData);
		return employeePayrollData;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		empPayrollList.remove(empId-1);
	}
}
