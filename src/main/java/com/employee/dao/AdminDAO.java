package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Employee> readDetaisl(List<Employee> list) {		
		try (Connection con = DBConnectivity.getConnection()) {
			String sql = "select * from employee";
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
			
			while (rs.next()) {
				Employee emp = new Employee(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4));

                list.add(emp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return list;
	}
	
}
