package com.demo.account.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.account.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	List<Employee> empList = new ArrayList<Employee>();
	
	public Employee findEmployeeById(int empId) {
		// TODO Auto-generated method stub
		Connection conn;
		try {
			conn =  DBUtil.getDBConnection();
			PreparedStatement pstmt = conn.prepareStatement("select empno, ename, job, hiredate,sal,dept_name "
					+ "from emp e,department_master d where empno = ? and e.deptno = d.dept_code");
			pstmt.setInt(1,empId);
			ResultSet rs = pstmt.executeQuery();
			Employee employee = new Employee();
			while(rs.next()) {
				employee.setEmpNo(rs.getInt("empNo"));
				employee.setEmpName(rs.getString("ename"));
				employee.setJob(rs.getString("job"));
				employee.setHireDate(rs.getDate("hiredate").toLocalDate());
				employee.setSalary(rs.getDouble("sal"));
				employee.setDeptName(rs.getString("dept_name"));
				
			}
			return employee;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
/*	@Override
	public List<Employee> getEmployees() {
		System.out.println("DAO - in getEmployees ");
		Employee employee = new Employee();
		employee.setEmpNo(1);
		employee.setEmpName("Hemanth");
		employee.setHireDate(LocalDate.of(2018, 11, 22));
		employee.setSalary(8000);
		employee.setJob("Developer");
		empList.add(employee);
		employee = new Employee();
		employee.setEmpNo(2);
		employee.setEmpName("Hemant");
		employee.setHireDate(LocalDate.of(2018, 11, 22));
		employee.setSalary(10000);
		employee.setJob("Developer");
		empList.add(employee);
		return empList;
	}*/

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
