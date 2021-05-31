package com.java.glt;

import java.util.ArrayList;
import java.util.List;


public class StudentDAO {

	static List<Student> lstStudent = null;
	
	static {
		lstStudent = new ArrayList<Student>();
	}
	
	public String addStudentDao(Student student) {
		lstStudent.add(student);
		return "Student Added Successfully...";
	}
	
	public List<Student> showStudentDao() {
		return lstStudent;
	}

}
