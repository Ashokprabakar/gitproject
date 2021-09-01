package com.demo.account.dao;

import java.util.List;

import com.demo.account.dto.Employee;

public interface EmployeeDao {
	public Employee findEmployeeById(int empId);
	public List<Employee> getEmployees();
}

