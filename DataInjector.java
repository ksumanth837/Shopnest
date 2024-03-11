package com.shopNest.dbHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataInjector {


	@SuppressWarnings("finally")
	public static String addCustomer(String uname, String mail, String pass, String gender, String address) {
		
		String url="jdbc:mysql://localhost:3306/shopNest";
	    String user="root";
		String password="root";
		String sql="INSERT INTO customers VALUES(?,?,?,?,?)";
		String regStatus="";
		
		try {
			Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,uname);
			ps.setString(2,mail);
			ps.setString(3,pass);
			ps.setString(4,gender);
			ps.setString(5,address);
			ps.executeUpdate();
			regStatus="success";
		}
		catch(Exception ex) {
			System.out.println("Problem in adding customer");
			ex.printStackTrace();
			regStatus="fail";
		}
		finally {
			return regStatus;
		}
	}

}
