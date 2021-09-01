package com.demo.account.sevice;

import java.util.List;

import com.demo.account.dao.EmployeeDao;
import com.demo.account.dto.Employee;

public class EmployeeServiceImpl implements EmployeeServices{
	EmployeeDao empDao;
	public EmployeeServiceImpl(EmployeeDao empDao) {
		this.empDao = empDao;
	}
	
	public Employee getEmployeeById(int empId) {
		Employee emp = empDao.findEmployeeById(empId);
		return emp;
	}
	
	public List<Employee> getEmployees(){
		
		System.out.println("Service in getEmployees");
		List<Employee> empList = empDao.getEmployees();
		return empList;
	}

	@Override
	public List<Employee> getEmployeesByDept() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}
	
}
