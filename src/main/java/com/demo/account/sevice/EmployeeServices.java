package com.demo.account.sevice;

import java.util.List;

import com.demo.account.dto.Employee;

public interface EmployeeServices {
	public Employee getEmployeeById(int empId);
	public List<Employee> getEmployees();
	public List<Employee> getEmployeesByDept();
	public void deleteEmployee(int empId);
}
