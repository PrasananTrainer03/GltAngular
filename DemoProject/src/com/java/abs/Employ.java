package com.java.abs;

public class Employ {

	int empno;
	String name;
	int basic;
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}

	public Employ(int empno, String name, int basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
}
