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

@WebServlet("/view")
public class ReadingDetails extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private AdminService service = new AdminService();

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        List<Employee> list = service.readDeatils();

        request.setAttribute("employees", list);

        RequestDispatcher rd =
                request.getRequestDispatcher("Index.jsp");

        rd.forward(request, response);
    }
}