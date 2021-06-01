package com.java.glt;

import java.util.List;

public class StudentBAL {

	static StringBuilder sb=new StringBuilder();
	
	public List<Student> showStudentBal() {
		StudentDAO dao = new StudentDAO();
		return dao.showStudentDao();
	}
	
	public Student searchStudentBal(int sno) {
		Student student = new StudentDAO().searchStudentDao(sno);
		return student;
	}
	
	public String addStudentBal(Student student) throws StudentException {
		if (validateStudent(student)==true) {
			StudentDAO dao = new StudentDAO();
			dao.addStudentDao(student);
			return "Student Record Added Successfully...";
		} else {
			throw new StudentException(sb.toString());
		}
	}
	
	public String deleteStudentBal(int sno) {
		StudentDAO dao = new StudentDAO();
		return dao.deleteStudentDao(sno);
	}
	public String updateStudentBal(Student student) throws StudentException {
		if (validateStudent(student)==true) {
			StudentDAO dao = new StudentDAO();
			return dao.updateStudentDao(student);
		//	return "Student Record Updated Successfully...";
		} else {
			throw new StudentException(sb.toString());
		}
	}
	public boolean validateStudent(Student student) {
		boolean isValid=true;
		
		if (student.getSno() < 0) {
			sb.append("Student No Cannot be Zero or Negative \n");
			isValid=false;
		}
		if (student.getName().length() <= 3) {
			sb.append("Student Name Must be Min. 4 chars \n");
			isValid=false;
		}
		if (student.getCity().length() <= 3) {
			sb.append("Student City Must be Min. 4 chars \n");
			isValid=false;
		}
		if (student.getCgp() <= 0) {
			sb.append("CGP cannot be zero or Negative...\n");
		}
		return isValid;
	}
}
