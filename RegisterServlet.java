package com.shopNest.customer;

import java.io.IOException;

import com.shopNest.dbHandler.DataInjector;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname=req.getParameter("uname");
		String mail=req.getParameter("mail");
		String pass=req.getParameter("pass");
		String gender=req.getParameter("gender");
		String address=req.getParameter("address");
		
		String status=DataInjector.addCustomer(uname,mail,pass,gender,address);
		resp.sendRedirect("login.jsp");
	}
	

}
