package com.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDAO {

	public static void createEmployee(Employee emp) throws Exception {
		Connection conn = DB.connection();
		String query = Query.insert;
		PreparedStatement pst = conn.prepareStatement(query);
		pst.setInt(1, emp.getEmpId());
		pst.setString(2, emp.getEmpName());
		pst.setInt(3, emp.getSalary());
		pst.executeUpdate();
		pst.close();

	}

	public static ArrayList<Employee> readAllEmp() throws Exception {
		ArrayList<Employee> emplist = new ArrayList<>();
		Connection conn = DB.connection();
		String query = Query.read;
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			Employee employee = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
			emplist.add(employee);

		}
		st.close();
		return emplist;

	}

	public static void updateEmployee(int Id, String Name) throws SQLException {
		Connection conn = DB.connection();
		String query = Query.update;
		PreparedStatement pst = conn.prepareStatement(query);
		pst.setString(1, Name);
		pst.setInt(2, Id);
		pst.executeUpdate();
		pst.close();

	}

	public static void deleteEmp(int ID) throws SQLException {
		Connection conn = DB.connection();
		String query = Query.delete;
		PreparedStatement pst = conn.prepareStatement(query);
		pst.setInt(1, ID);
		pst.execute();

	}

}
