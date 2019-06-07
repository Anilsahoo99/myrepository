package com.employee.dao;

import java.util.ArrayList;

import com.employee.entity.EmployeeEntity;

 

public interface EmployeeDao {
	
	// this method is for create Employee
	public abstract void createEmployee(EmployeeEntity employeeEntity);
	
	// this method is for Get all Employee
	public abstract ArrayList<EmployeeEntity> getAllEmployee();
	
	//
	public abstract void deleteEmployeeById(int employeeId);
	
	//
	public abstract EmployeeEntity getEmployeeById(int employeeId);
	
	public abstract void updateEmployee(EmployeeEntity employeeEntity);

}
