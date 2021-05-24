package com.java.glt;

public class Quiz1 {

	public void show(int x) {
		System.out.println("Show w.r.t. Integer " +x);
	}
	
	public void show(String x) {
		System.out.println("Show w.r.t. String " +x);
	}
	
	public void show(double x) {
		System.out.println("Show w.r.t. Double  " +x);
	}
	
	public static void main(String[] args) {
		Quiz1 obj = new Quiz1();
		obj.show(12.5);
	}
}
