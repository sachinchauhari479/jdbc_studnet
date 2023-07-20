package com.jsp.jdbc_crud_with_student.controller;

import java.util.Scanner;

import com.jsp.jdbc_crud_with_student.Dto.Student;
import com.jsp.jdbc_crud_with_student.Service.StudentService;

public class studentcontroller {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		StudentService studentservice=new StudentService();
		Student student=new Student();
		
		System.out.println("1. INSERT\n2.DELETE\n3.UPDATE\n4.DISPLAY\n5.GETBYID\n6.EXIT");
		System.out.println("please enter your option: ");
		int ch=scanner.nextInt();
		switch(ch) {
		case 1: {
			//insert data into table
			System.out.println("Please provide employee details");
			System.out.println("enter employee id");
			int id=scanner.nextInt();
			System.out.println("enter the employee name");
			String name=scanner.next();
			System.out.println("enter the employee email");
			String email=scanner.next();
			System.out.println("enter the phone number");
			long phone=scanner.nextLong();
			
			student.setStudentId(id);
			student.setStudentName(name);
			student.setStudentEmail(email);
			student.setStudentPhone(phone);
			
			studentservice.insertStudent(student);
			System.out.println("data is inserted");
			
		}break;
		case 2: {
			System.out.println("Please provide employee id to delete");
			System.out.println("enter employee id");
			int id=scanner.nextInt();
			int id1=studentservice.deleteStudent(id);
			if(id1>0) {
				System.out.println("data is deleted!!!");
			}
			else {
				System.out.println("Id not found please enter valid id");
			}

			
		}break;
		case 3: {
			System.out.println("1.Name\n 2.Email\n 3.Phone");
			System.out.println("please choose your option to update your data");
			int ch1=scanner.nextInt();
			switch(ch1) {
			case 1: {
				System.out.println("Please provide student id and name for update name");
				System.out.println("enter employee id");
				int id=scanner.nextInt();
				System.out.println("enter employee name");
				String name=scanner.next();
				int id1=studentservice.updateStudentName(id, name);
	            if(id1!=0){
	                System.out.println("data is update");
	            }
	            else {
	                System.out.println("data is not found");
	            }
				
			}break;
			case 2: {
				System.out.println("Please provide student id and email for update Email");
				System.out.println("enter employee id");
				int id=scanner.nextInt();
				System.out.println("enter employee Email");
				String email=scanner.next();
				int id1=studentservice.updateStudentEmail(id, email);
	            if(id1!=0){
	                System.out.println("data is update");
	            }
	            else {
	                System.out.println("data is not found");
	            }   
				
			}break;
			case 3: {
				System.out.println("Please provide student id and phone for update phone");
				System.out.println("enter employee id");
				int id=scanner.nextInt();
				System.out.println("enter employee phone");
				Long phone=scanner.nextLong();
				int id1=studentservice.updateStudentPhone(id, phone);
	            if(id1!=0){
	                System.out.println("data is update");
	            }
	            else {
	                System.out.println("data is not found");
	            }  
				
			}break;
			default: {
				System.out.println("invalid choice!!!!");
			}break;
			}
            
		}break;
		case 4: {
			studentservice.displayStudent();
//			System.out.println("write method for display");
			
		}break;
		case 5: {
			System.out.println("write method for getbyid");
			
		}break;
		case 6: {
			System.exit(0);
		}break;
		default :
		{
			System.out.println("invalid choice!!!!");
		}
		break;
		}

	}

}
