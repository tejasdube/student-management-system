package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class studentdeo {

	public static boolean insertdata(student st) {
		boolean f = false;
		try {
			// jdbc code

			Connection connection = jdbc.DB();

			// write your query
			String q = "insert into studentmanage(sname,sphone,scity)values (?,?,?)";
			// prepare statement
			PreparedStatement p = connection.prepareStatement(q);
			p.setString(1, st.getStudentName());
			p.setString(2, st.getStudentPhone());
			p.setString(3, st.getStudentCity());
			p.executeUpdate();
			connection.close();

			f = true;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}

	public static boolean deletestudent(int userId) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			// jdbc code

			Connection connection = jdbc.DB();

			// write your query
			String q = "delete from studentmanage where sid=?";
			// prepare statement
			PreparedStatement p = connection.prepareStatement(q);
			p.setInt(1, userId);
			p.executeUpdate();
			connection.close();
			f = true;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}

	public static void display() {
		// TODO Auto-generated method stub
		try {
			// jdbc code

			Connection connection = jdbc.DB();

			// write your query
			String q = "select*from studentmanage";
			// prepare statement
//			PreparedStatement p = connection.prepareStatement(q);
//			p.setInt(1, userId);
//			p.executeUpdate();
//			f=true;
			Statement stmt = connection.createStatement();
			ResultSet set = stmt.executeQuery(q);
			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString("scity");
				System.out.println("ID : " + id);
				System.out.println("NAME : " + name);

				System.out.println("PHONE : " + phone);
				System.out.println("city : " + city);
			}
			connection.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
