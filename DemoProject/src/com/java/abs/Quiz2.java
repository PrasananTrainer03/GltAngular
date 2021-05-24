package com.java.abs;

public class Quiz2 {

	public static void main(String[] args) {
		Employ e1 = new Employ(1, "Ravali", 56622);
		Employ e2 = new Employ(1, "Ravali", 56622);
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}
}
