package com.java.abs.cons;

abstract class Employ{
	int empno;
	String name;
	double basic;

	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Apparao extends Employ {

	public Apparao(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}

class Mani extends Employ {

	public Mani(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}
class SaiKiran extends Employ {

	public SaiKiran(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}
public class AbsCon {
	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Apparao(1, "Apparao", 66234),
			new Mani(3, "Mani", 67844),
			new SaiKiran(4, "SaiKiran", 98323)
		};
		for (Employ employ : arr) {
			System.out.println(employ);
		}
		
	}
}
