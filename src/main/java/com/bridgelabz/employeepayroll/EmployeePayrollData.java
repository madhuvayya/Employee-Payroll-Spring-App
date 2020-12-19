package com.bridgelabz.employeepayroll;

public class EmployeePayrollData {
	private int employeeId;
	private String name;
	private long salary;
	
	public EmployeePayrollData() {}

	public EmployeePayrollData(String name, long salary, int employeeId) {
		this.name = name;
		this.salary = salary;
		this.employeeId = employeeId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
}
