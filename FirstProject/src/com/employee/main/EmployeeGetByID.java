package com.employee.main;

import com.employee.bean.EmployeeBean;
import com.employee.service.impl.EmployeeServiceImpl;

public class EmployeeGetByID {

	public static void main(String[] args) {
		 EmployeeServiceImpl  employeeServiceImpl = new EmployeeServiceImpl();
		 EmployeeBean employeeBean = employeeServiceImpl.getEmployeeById(2);
		 
		 System.out.println("id = " +employeeBean.getId());
		 System.out.println("Name = " +employeeBean.getName());
		 System.out.println("Age = " +employeeBean.getAge());

	}

}
