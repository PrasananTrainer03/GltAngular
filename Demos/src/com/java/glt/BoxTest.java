package com.java.glt;

public class BoxTest {

	public void show(Object ob) {
		//System.out.println(ob.getClass().getSimpleName());
		String type = ob.getClass().getSimpleName();
		System.out.println(type);
		if (type.equals("Integer")) {
			System.out.println("Integer Casting Happening...");
			int x = (Integer)ob;
			System.out.println("X value  " +x);
		}
		if (type.equals("Double")) {
			System.out.println("Double Casting Happening...");
			double x = (Double)ob;
			System.out.println("Double Value  " +x);
		}
		if (type.equals("String")) {
			System.out.println("String Casting Happening...");
			String x = (String)ob;
			System.out.println("String Value  " +x);
		}
	}
	public static void main(String[] args) {
		int x=12;
		double y=12.5;
		String name="GLT";
		BoxTest obj = new BoxTest();
		obj.show(x);
		obj.show(y);
		obj.show(name);
	}
}
