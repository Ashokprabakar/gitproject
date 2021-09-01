package com.demo.account;

import java.util.List;

import com.demo.account.dao.EmployeeDao;
import com.demo.account.dao.EmployeeDaoImpl;
import com.demo.account.dto.Employee;
import com.demo.account.sevice.EmployeeServiceImpl;
import com.demo.account.sevice.EmployeeServices;

public class EmployeeDriver {	
	public static void main(String[] args) {
		EmployeeDao employeeDao =  new EmployeeDaoImpl();
		EmployeeServices employeeService = new EmployeeServiceImpl(employeeDao);
		
		Employee empList = employeeService.getEmployeeById(4);
		System.out.println(empList);
	}

}
