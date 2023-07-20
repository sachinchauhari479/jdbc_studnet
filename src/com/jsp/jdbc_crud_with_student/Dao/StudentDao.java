package com.jsp.jdbc_crud_with_student.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.jdbc_crud_with_student.Dto.Student;

public class StudentDao {

	String url="jdbc:mysql://localhost:3306/user";
	String user="root";
	String pass="root";
	
	Connection connection=null;
	/*
	 * this method is used to insert data into table
	 * here , first step is import the driver and then second step is connect the databsee
	 * therefore we write the query to insert the data into table and then use prepared statement to connect the query
	 * therfore we use prepared var to set the data into query and execute the query for insert
	 */
	public Student insertStudent(Student student) {
		try {
			//first step
			Class.forName("com.mysql.cj.jdbc.Driver");
			//second step
			Connection connection=DriverManager.getConnection(url,user,pass);
			//third step
			String insertQuery="insert into student values(?,?,?,?)";
			PreparedStatement preparedstatement=connection.prepareStatement(insertQuery);
			preparedstatement.setInt(1, student.getStudentId());
			preparedstatement.setString(2, student.getStudentName());
			preparedstatement.setString(3, student.getStudentEmail());
			preparedstatement.setLong(4, student.getStudentPhone());
			preparedstatement.execute();
		
			return student;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/*
	 * this method is used to insert data into table
	 * here , first step is import the driver and then second step is connect the databsee
	 * therefore we write the query to delet the data into table and then use prepared statement to connect the query
	 * therfore we use prepared var to set the data into query and execute the query for delete
	 */
	public int deleteStudent (int studentId) {
        //first step
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//second step
			connection=DriverManager.getConnection(url,user,pass);
			//third step
			String deletQuery="delete from student where id = ?";
			PreparedStatement preparedstatement=connection.prepareStatement(deletQuery);
			preparedstatement.setInt(1, studentId);
			return preparedstatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public int updateStudentName(int studentId, String studentName) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//second step
			connection=DriverManager.getConnection(url,user,pass);
			//third step
			String updateQuery="update student set name = ? where id = ? ";
			PreparedStatement preparedstatement=connection.prepareStatement(updateQuery);
			preparedstatement.setString(1, studentName);
			preparedstatement.setInt(2, studentId);
			
			return preparedstatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public int updateStudentEmail(int studentId, String studentEmail) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//second step
			connection=DriverManager.getConnection(url,user,pass);
			//third step
			String updateQuery="update student set email = ? where id = ? ";
			PreparedStatement preparedstatement=connection.prepareStatement(updateQuery);
			preparedstatement.setString(1, studentEmail);
			preparedstatement.setInt(2, studentId);
			
			return preparedstatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public int updateStudentPhone(int studentId, long studentPhone) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//second step
			connection=DriverManager.getConnection(url,user,pass);
			//third step
			String updateQuery="update student set phone = ? where id = ? ";
			PreparedStatement preparedstatement=connection.prepareStatement(updateQuery);
			preparedstatement.setLong(1, studentPhone);
			preparedstatement.setInt(2, studentId);
			
			return preparedstatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public void displayStudent(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(url,user,pass);
			String displayQuery="select * from student";
			PreparedStatement preparedstatement=connection.prepareStatement(displayQuery);
			ResultSet resultset=preparedstatement.executeQuery();
			while(resultset.next()) {
			int id=resultset.getInt("Id");
			String name=resultset.getString("name");
			String email=resultset.getString("email");
			Long phone=resultset.getLong("phone");
			System.out.println("id= "+id);
			System.out.println("name= "+name);
			System.out.println("email= "+email);
			System.out.println("phone= "+phone);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	

}

