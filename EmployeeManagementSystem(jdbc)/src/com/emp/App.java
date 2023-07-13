package com.emp;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {

		while (true) {
			System.out.println("\n EMPLOYEE MANAGEMENT SYSTEM");
			System.out.println("1= create 2= read 3 =update 4=delete");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();

			if (choice < 1 || choice >= 5)
				break;
			switch (choice) {

			case 1:
				System.out.println("id , name , salary");
				int id = scanner.nextInt();
				String name = scanner.next();
				int salary = scanner.nextInt();
				Employee emp = new Employee(id, name, salary);
				EmpDAO.createEmployee(emp);
				break;

			case 2:
				ArrayList<Employee> list = EmpDAO.readAllEmp();
				for (Employee em : list) {
					System.out.println(em);
				}
				break;

			case 3:
				System.out.println("id , name");
				int Id = scanner.nextInt();
				String Name = scanner.next();
				EmpDAO.updateEmployee(Id, Name);
				break;

			case 4:
				System.out.println("id");
				int ID = scanner.nextInt();
				EmpDAO.deleteEmp(ID);
				break;
			}

		}
	}
}
