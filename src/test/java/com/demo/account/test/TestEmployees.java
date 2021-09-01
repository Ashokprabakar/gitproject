package com.demo.account.test;

import static org.junit.Assert.*;


import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.demo.account.dao.EmployeeDao;
import com.demo.account.dto.Employee;
import com.demo.account.sevice.EmployeeServiceImpl;
import com.demo.account.sevice.EmployeeServices;

@RunWith(MockitoJUnitRunner.class)
public class TestEmployees {
	static EmployeeServices employeeServices = null;
	static EmployeeDao mockEmployeeDao = null;
	private static Employee emp1;
	private static Employee emp2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		mockEmployeeDao = Mockito.mock(EmployeeDao.class);
		employeeServices = new EmployeeServiceImpl(mockEmployeeDao);
		emp1 = new Employee();
		emp1.setEmpNo(1);
		emp1.setEmpName("hemant");
		emp1.setHireDate(LocalDate.of(2018, 11, 22));
		emp1.setJob("Developer");
		emp1.setSalary(8000);
		emp2 = new Employee();
		emp2.setEmpNo(2);
		emp2.setEmpName("hemanth");
		emp2.setHireDate(LocalDate.of(2018, 01, 22));
		emp2.setJob("Developer");
		emp2.setSalary(10000);
		
		Mockito.when(mockEmployeeDao.getEmployees()).thenReturn(Arrays.asList(emp1,emp2));
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception{
		
	}
	@BeforeEach
	void setUp() throws Exception{
		
	}
	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		List<Employee> allEmployees = employeeServices.getEmployees();
		
		assertNotNull(allEmployees);
		assertEquals(2, allEmployees.size());
	}

}
