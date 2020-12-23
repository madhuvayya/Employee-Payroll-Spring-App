package com.bridgelabz.employeepayroll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

public @ToString class EmployeePayrollDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
	public String name;

	@Min(value = 500, message = "Min wage should be more than 500")
	public long salary;

	@Pattern(regexp = "male|female", message = "Gender needs to be male or female")
	public String gender;

	@JsonFormat(pattern = "dd MMM yyyy")
	@NotNull(message = "Start date should not be empty")
	@PastOrPresent(message = "Start date should be past or today's date")
	public LocalDate startDate;

	@NotBlank(message = "Note can't be empty")
	public String note;

	@NotBlank(message = "Profile pic can't be empty")
	public String profilePic;

	@NotNull(message = "Department should not be empty")
	public List<String> department;
}
