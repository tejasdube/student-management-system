package com.emp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

	static Connection conn = null;

	public static Connection connection() {

		try {

			// load a driver classs
			Class.forName("com.mysql.cj.jdbc.Driver");

			// obtain a connection

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ems", "root", "tejasdube");

		} catch (Exception e) {
			e.printStackTrace();

		}
		return conn;

	}

}
