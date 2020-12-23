package com.bridgelabz.employeepayroll.repository;

import com.bridgelabz.employeepayroll.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData,Integer> {
}
