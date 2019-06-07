package com.employee.service.impl;

import java.util.ArrayList;

import com.employee.bean.EmployeeBean;
import com.employee.dao.impl.EmployeeDaoImpl;
import com.employee.entity.EmployeeEntity;
import com.employee.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public ArrayList<EmployeeBean> getAllEmployee() {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		
		ArrayList<EmployeeEntity> employeeEntityList = employeeDaoImpl.getAllEmployee();
		
		ArrayList<EmployeeBean>  employeeBeanList = new ArrayList<EmployeeBean>();
		
		for (int i=0; i<employeeEntityList.size(); i++)
		{
			EmployeeEntity employeeEntity = employeeEntityList.get(i);
			
	EmployeeBean employeeBean = new EmployeeBean(employeeEntity.getId(), employeeEntity.getName(), employeeEntity.getAge());
	
	employeeBeanList.add(employeeBean);	
		
		}
		
		return employeeBeanList;
	}

	@Override
	public void createEmployee(EmployeeBean employeeBean) {
		 
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		 
		
		EmployeeEntity employeeEntity =new EmployeeEntity(employeeBean.getId(), employeeBean.getName(), employeeBean.getAge());
		
		employeeDaoImpl.createEmployee(employeeEntity);
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		
		employeeDaoImpl.deleteEmployeeById(employeeId);
		
	}

	@Override
	public EmployeeBean getEmployeeById(int employeeId) {
		 
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		
		EmployeeEntity employeeEntity = employeeDaoImpl.getEmployeeById(employeeId);
		
EmployeeBean employeeBean = new EmployeeBean(employeeEntity.getId(), employeeEntity.getName(), employeeEntity.getAge());
		
		return employeeBean;
	}

	@Override
	public void updateEmployee(EmployeeBean employeeBean) {

		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		 
		
		EmployeeEntity employeeEntity =new EmployeeEntity(employeeBean.getId(), employeeBean.getName(), employeeBean.getAge());
		
		employeeDaoImpl.updateEmployee(employeeEntity);
		
	}

}
