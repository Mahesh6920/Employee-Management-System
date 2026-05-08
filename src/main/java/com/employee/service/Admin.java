package com.employee.service;

import com.employee.dao.AdminDAO;
import com.employee.model.Employee;

public class Admin {
	
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
	
}
