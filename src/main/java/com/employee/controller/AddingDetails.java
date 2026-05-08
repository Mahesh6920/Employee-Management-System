package com.employee.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.employee.model.Employee;
import com.employee.service.Admin;

@WebServlet("/add")
public class AddingDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Admin admin = new Admin();
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		String name = request.getParameter("name");
		System.out.println(name);
		int age = Integer.parseInt(request.getParameter("age"));
		System.out.println(age);
		int salary =  Integer.parseInt(request.getParameter("salary"));
		System.out.println(salary);
		
		Employee employee = new Employee(id, name, age, salary);
		
		if (admin.addDetails(employee)) {

		    response.setContentType("text/html");

		    PrintWriter out = response.getWriter();

		    out.println("<script>");
		    out.println("alert('Employee Added Successfully');");
		    out.println("window.location='Index.jsp';");
		    out.println("</script>");
		} else {

		    response.setContentType("text/html");

		    PrintWriter out = response.getWriter();

		    out.println("<script>");
		    out.println("alert('Failed To Add Employee');");
		    out.println("window.location='Index.jsp';");
		    out.println("</script>");
		}
		
		
		
	}

}
