package com.employee.main;

import java.util.ArrayList;

import com.employee.bean.EmployeeBean;
import com.employee.service.impl.EmployeeServiceImpl;

public class EmployeeGetAll {

	public static void main(String[] args) {

		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		
		ArrayList<EmployeeBean> employeeBeanList = employeeServiceImpl.getAllEmployee();
		
		for (int i= 0; i<employeeBeanList.size(); i++) 
		{
			EmployeeBean employeeBean =employeeBeanList.get(i);
			
			System.out.println("id = "+employeeBean.getId());
			System.out.println("Name = "+employeeBean.getName());
			System.out.println("Age = "+employeeBean.getAge());
			System.out.println("=======================================");
			
		}
		
		
		
	}

}
