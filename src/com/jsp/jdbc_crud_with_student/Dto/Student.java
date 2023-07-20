package com.jsp.jdbc_crud_with_student.Dto;

public class Student {
	private int StudentId;
	private String StudentName;
	private String StudentEmail;
	private long studentPhone;
	
	
	public Student() {
		super();
	}

	/*
	 * argument constructor
	 */
	public Student(int StudentId, String StudentName, String StudentEmail, long studentPhone) {
		super(); 
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.StudentEmail = StudentEmail;
		this.studentPhone = studentPhone;
	}
	
	
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		this.StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}
	public String getStudentEmail() {
		return StudentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.StudentEmail = studentEmail;
	}
	public long getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
	}
	

}
