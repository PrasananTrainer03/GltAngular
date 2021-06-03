package com.java.glt;

import java.util.ArrayList;
import java.util.List;


public class StudentDAO {

	static List<Student> lstStudent = null;
	
	static {
		lstStudent = new ArrayList<Student>();
	}
	
	public String deleteStudentDao(int sno) {
		Student studentFound = searchStudentDao(sno);
		if (studentFound!=null) {
			lstStudent.remove(studentFound);
			return "Student Record Deleted...";
		} else {
			return "Student Record Not Found...";
		}
	}
	public String updateStudentDao(Student student) {
		Student studentFound = searchStudentDao(student.getSno());
		if (studentFound !=null) {
			studentFound.setName(student.getName());
			studentFound.setCgp(student.getCgp());
			studentFound.setCity(student.getCity());
			return "Record Updated...";
		} else {
			return "Student Record Not Found...";
		}
	}
	public Student searchStudentDao(int sno) {
		Student student = null;
		for (Student s : lstStudent) {
			if (sno==s.getSno()) {
				student =s;
				break;
			}
		}
		return student;
	}
	
	public String addStudentDao(Student student) {
		lstStudent.add(student);
		return "Student Added Successfully...";
	}
	
	public List<Student> showStudentDao() {
		return lstStudent;
	}

}
