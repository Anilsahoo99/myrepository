package com.employee.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.employee.dao.EmployeeDao;
import com.employee.entity.EmployeeEntity;
import com.employee.util.DatabaseConnection;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public ArrayList<EmployeeEntity> getAllEmployee() {
		
		Connection conn = null;
		Statement stm = null;
		EmployeeEntity employeeEntity = null;
		ArrayList<EmployeeEntity> employeeList = new ArrayList<EmployeeEntity>();
		try {
			conn = DatabaseConnection.getMySqlConnection();
			stm = conn.createStatement();
			//SELECT * FROM employee;
			String sql =  "SELECT * FROM employee";
			  ResultSet rs  =stm.executeQuery(sql);
			  while(rs.next()) 
			  {
				  int id = rs.getInt(1);
				  String name = rs.getString(2);
				  int age = rs.getInt(3);
				  employeeEntity = new EmployeeEntity(id, name, age);
				  employeeList.add(employeeEntity);
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeList;
	}

	
	@Override
	public void createEmployee(EmployeeEntity employeeEntity) {
		Connection conn = null;
		Statement stm = null;
		try {
			conn = DatabaseConnection.getMySqlConnection();
			stm = conn.createStatement();
			
			String name =employeeEntity.getName();
			int id = employeeEntity.getId();
			int age = employeeEntity.getAge();
			
			
			//INSERT INTO employee(id,name,age) values(2,'xyz',22);
			String sql = "INSERT INTO employee(id,name,age) values("+id+",'"+name+"',"+age+")";
			
			 boolean isInserted =stm.execute(sql);
			 
			 System.out.println(isInserted);
			 
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		Connection conn = null;
		Statement stm = null;
		try {
			conn = DatabaseConnection.getMySqlConnection();
			stm = conn.createStatement();
			
			//DELETE FROM employee where id = 1;
			String sql =  "DELETE FROM employee where id = "+employeeId;
			
			 boolean isDeleted =stm.execute(sql);
			 
			 System.out.println(isDeleted);
			 
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public EmployeeEntity getEmployeeById(int employeeId) {
		
		Connection conn = null;
		Statement stm = null;
		EmployeeEntity employeeEntity = null;
		try {
			conn = DatabaseConnection.getMySqlConnection();
			stm = conn.createStatement();
			//SELECT * FROM employee WHERE id = 1;
			String sql =  "SELECT * FROM employee WHERE id = "+employeeId;
			  ResultSet rs  =stm.executeQuery(sql);
			  while(rs.next()) 
			  {
				  int id = rs.getInt(1);
				  String name = rs.getString(2);
				  int age = rs.getInt(3);
				  employeeEntity = new EmployeeEntity(id, name, age);
				 // employeeEntity = new EmployeeEntity(rs.getInt(1), rs.getString(2), rs.getInt(3));
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employeeEntity;
	}


	@Override
	public void updateEmployee(EmployeeEntity employeeEntity) {
		Connection conn = null;
		Statement stm = null;
		try {
			conn = DatabaseConnection.getMySqlConnection();
			stm = conn.createStatement();
			
			String name =employeeEntity.getName();
			int id = employeeEntity.getId();
			int age = employeeEntity.getAge();
			
			
			//UPDATE employee SET name ='abd',age=23 WHERE id =2;
			String sql = "UPDATE employee SET name = '" +name+"', age= "+age+" WHERE id ="+ id;
			
			 boolean isUpdated =stm.execute(sql);
			 
			 System.out.println(isUpdated);
			 
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
