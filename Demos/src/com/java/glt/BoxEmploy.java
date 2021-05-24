package com.java.glt;

public class BoxEmploy {

	public void show(Object ob) {
		// int x = (Integer)ob;
		Employ employ = (Employ)ob;
		System.out.println(employ);
	}
	public static void main(String[] args) {
		Employ employ = new Employ(1, "Ravali", 58852);
		BoxEmploy obj = new BoxEmploy();
		obj.show(employ);
	}
}
