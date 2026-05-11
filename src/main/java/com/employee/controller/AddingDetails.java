package com.employee.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

import com.employee.model.Employee;
import com.employee.service.AdminService;

@WebServlet("/add")
public class AddingDetails extends HttpServlet {

    private static final long serialVersionUID = 1L;

    AdminService admin = new AdminService();

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        int salary = Integer.parseInt(request.getParameter("salary"));

        Employee employee =
                new Employee(id, name, age, salary);

        boolean result = admin.addDetails(employee);

        if(result) {
        	response.sendRedirect("view");
        }
        else {

            response.getWriter().println("Failed To Add Employee");
        }
    }
}