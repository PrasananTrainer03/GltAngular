package com.java.glt;

public class Quiz3 {

	public void show(int x ) {
		System.out.println("Int  " +x);
	}
	public void show(Object x) {
		System.out.println("Object  " +x);
	}
	public static void main(String[] args) {
	//	int x=12;
		Integer x=12;
		new Quiz3().show(x);
	}
}
