package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;





public class start {
	public static void main(String[] args)  throws IOException{
		 System.out.println("welcome to student managment app");
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 while (true) {
			 System.out.println("PRESS 1 FOR ADD STUDENT");
			 System.out.println("PRESS 2 FOR DELETE STUDENT");
			 System.out.println("PRESS 3 FOR DISPLAY STUDENT");
			 System.out.println("PRESS 4 FOR EXIT APP");
			 int c=Integer.parseInt(br.readLine());
			 if(c==1) {
				 // add student
				 System.out.println("Enter a user name :");
				 String name=br.readLine();
				 System.out.println("enter phone number:");
				 String phone=br.readLine();
				 System.out.println("enter user city:");
				 String city=br.readLine();
				 student st=new student(name, phone, city);
				Boolean b= studentdeo.insertdata(st);
				if(b){
					System.out.println("succefully ADDED ......");
				}
				else {
					System.out.println("somthing went wrong");
				}
				
					System.out.println(st);	 
				 }else if (c==2) {
				 // delete student from database
					 System.out.println("ENTER ID FOR DELETE: ");
					 int userId=Integer.parseInt(br.readLine());
					Boolean d= studentdeo.deletestudent(userId);
				   if(d) {
					   System.out.println("deleted.....");
				   }else {
					System.out.println("something went wrong.....");
				}
			} 
			 else if(c==3) {
				 // display student
				 studentdeo.display();
			 }
			 else if(c==4) {
				 // exit app
				 break;
			 }
			 else {
				
			}
		 }
	}
}

