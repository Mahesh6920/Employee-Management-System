package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import com.employee.dao.AdminDAO;
import com.employee.model.Employee;

public class AdminService {
	
	AdminDAO dao = new AdminDAO();

	public boolean addDetails(Employee employee) {
		if (employee.getId() < 0) {
			return false;
		} else if (employee.getName() == null || employee.getName().trim() == null) {
			return false;
		} else if (employee.getAge() < 18 && employee.getAge() > 85) {
			return false;
		} else if (employee.getSalary() < 0) {
			return false;
		}
		
		return dao.addDetails(employee);
	}
	
	public List<Employee> readDeatils() {
		List<Employee> list = new ArrayList<Employee>();
		
		return dao.readDetaisl(list);
	}
	
}
