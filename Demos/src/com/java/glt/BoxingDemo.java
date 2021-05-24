package com.java.glt;

public class BoxingDemo {

	public static void main(String[] args) {
		int x=12;
		double y=12.5;
		String name="GLT";
		
		/* Boxing */ 
		
		Object ob1=x;
		Object ob2=y;
		Object ob3=name;
		
		/* Unboxing */ 
		int x1 = (Integer)ob1;
		double y1= (Double)ob2;
		String s1 = (String)ob3;
		
		System.out.println(++x1);
		System.out.println(++y1);
		System.out.println(s1);
	}
}
