package com.jsp.jdbc_crud_with_student.Service;

import com.jsp.jdbc_crud_with_student.Dao.StudentDao;
import com.jsp.jdbc_crud_with_student.Dto.Student;

public class StudentService {
	
	StudentDao studentdao=new StudentDao();
	
	public Student insertStudent(Student student) {
		Student stu=null;
		if(student.getStudentId()>=100) {
			stu= studentdao.insertStudent(student);
		}
		else
		{
			System.out.println("id is not found");
		}
		return stu;
	}
	public int deleteStudent (int studentId) {
		
		return studentdao.deleteStudent(studentId);
	}
	public int updateStudentName(int studentId, String studentName) {
		return studentdao.updateStudentName(studentId, studentName);
	}
	public int updateStudentEmail(int studentId, String studentEmail) {
		return studentdao.updateStudentEmail(studentId, studentEmail);
	}
	public int updateStudentPhone(int studentId, long studentPhone) {
		return studentdao.updateStudentPhone(studentId, studentPhone);
	}
	public void displayStudent(){
		studentdao.displayStudent();
	}
	
	
	

}
