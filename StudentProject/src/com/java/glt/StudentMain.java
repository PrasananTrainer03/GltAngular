package com.java.glt;

import java.util.List;
import java.util.Scanner;

public class StudentMain {

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
	
	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("M E N U");
			System.out.println("---------------");
			System.out.println("1. Add Student");
			System.out.println("2. Show Student");
			System.out.println("3. Exit");
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
				return;
			default : 
				System.out.println("Invalid Choice...");
			}
		} while(ch!=3);
	}
}
