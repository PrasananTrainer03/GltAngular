package com.java.abs;

public class Quiz1 {

	public static void main(String[] args) {
		String s1="Apparao";
		String s2 = new String("Apparao");
		String s3 ="Apparao";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
	}
}
