package com.java.glt;

import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void updateStudent() {
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student No  ");
		student.setSno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Student Name  ");
		student.setName(sc.nextLine());
		System.out.println("Enter Student City  ");
		student.setCity(sc.nextLine());
		System.out.println("Enter CGP   ");
		student.setCgp(Double.parseDouble(sc.nextLine()));
		try {
			String result = new StudentBAL().updateStudentBal(student);
			System.out.println(result);
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void addStudent() {
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student No  ");
		student.setSno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Student Name  ");
		student.setName(sc.nextLine());
		System.out.println("Enter Student City  ");
		student.setCity(sc.nextLine());
		System.out.println("Enter CGP   ");
		student.setCgp(Double.parseDouble(sc.nextLine()));
		try {
			String result = new StudentBAL().addStudentBal(student);
			System.out.println(result);
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void showStudent() {
		List<Student> studentList = new StudentBAL().showStudentBal();
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	
	public static void deleteStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student No   ");
		int sno = sc.nextInt();
		String result = new StudentBAL().deleteStudentBal(sno);
		System.out.println(result);
	}
	public static void searchStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student No   ");
		int sno = sc.nextInt();
		Student student = new StudentBAL().searchStudentBal(sno);
		if (student!=null) {
			System.out.println(student);
		} else {
			System.out.println("Invalid Student No...");
		}
	}
	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("M E N U");
			System.out.println("---------------");
			System.out.println("1. Add Student");
			System.out.println("2. Show Student");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice  ");
			ch = sc.nextInt();
			switch(ch) {
			case 1 :
					addStudent();
					break;
			case 2 : 
					showStudent();
					break;
			case 3 : 
					searchStudent();
					break;
			case 4 : 
					updateStudent();
					break;
			case 5 : 
					deleteStudent();
					break;
			case 6 :
				return;
			default : 
				System.out.println("Invalid Choice...");
			}
		} while(ch!=6);
	}
}
