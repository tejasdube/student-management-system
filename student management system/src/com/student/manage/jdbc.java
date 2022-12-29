package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc {
	static Connection con;
	
	public static  Connection DB () {
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create a connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","tejasdube");

			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		
	}
		return con;
	

}
	
}