package com.employee.main;

import com.employee.bean.EmployeeBean;
import com.employee.service.impl.EmployeeServiceImpl;

public class EmployeeCreate {
	
	public static void main(String[] args) {
		
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		
		
		EmployeeBean employeeBean =new EmployeeBean(13, "anil1", 25);
		
		
		
		employeeServiceImpl.createEmployee(employeeBean );
		
		 
		
	}

}
