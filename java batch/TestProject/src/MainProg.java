
public class MainProg {

	public static void main(String[] args) {
		Employ emp1 = new Employ(1, "Mani", 84825);
		Employ emp2 = new Employ(1, "Mani",84825);
		System.out.println(emp1==emp2);
		System.out.println(emp1.equals(emp2));
	}
}
