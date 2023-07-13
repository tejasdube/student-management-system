package com.emp;

public class Query {
	static String insert = "insert into emp (empId,empName,salary)values(?,?,?)";
	static String read = " select *from emp";
	static String update = "update emp SET empName=? where empId=?";
	static String delete = "delete from emp where empId=?";

}
