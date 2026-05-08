package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.employee.model.Employee;
import com.employee.util.DBConnectivity;

public class AdminDAO {
		
	public boolean addDetails(Employee employee) {
		
		try (Connection con = DBConnectivity.getConnection()) {
			
			String sql = "INSERT INTO employee VALUES(?, ?, ?, ?);";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setInt(3, employee.getAge());
			ps.setInt(4, employee.getSalary());
			
			int row = ps.executeUpdate();
			if (row > 0) {
				return true;
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		return false;
	}
	
}
