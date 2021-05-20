
public class Employ {

	int empno;
	String name;
	double basic;
	
	public Employ() {} 
	
	


	@Override
	public boolean equals(Object obj) {
		Employ emp = (Employ) obj;
		if (emp.empno==empno &&
				emp.name==name &&
				emp.basic==basic) {
			return true;
		} else {
			return false;
		}
//		if (emp.basic==basic) {
//			return true;
//		} else {
//			return false;
//		}
	}


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
