package com.nacre;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class Registration_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dis = request.getRequestDispatcher("nacre.html");
		dis.forward(request, response);
	  }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fname");
		String mname=request.getParameter("mname");
		String lname=request.getParameter("lname");
		String num=request.getParameter("num");
		String email=request.getParameter("email");
		String age=request.getParameter("age");
		String gender=request.getParameter("gender");
		
		
       System.out.println(fname);
		
	//	try {
//			Class.forName("oracle.jdbc.driver.oracleDriver");
//			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","8888");
//			PreparedStatement pst=con.prepareStatement("insert into registration_detail value, (?,?,?,?,?,?,?)");
//			
//			pst.setString(1,fname);
//			pst.setString(2,mname);
//
//			pst.setString(3,lname);
//
//			pst.setString(4,num);
//			pst.setString(5,email);
//			pst.setString(6,age);
//			pst.setString(7,gender);
//			pst.executeUpdate();
//			con.close();
			out.println("successfully login");

//			
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
		
}
    }


















