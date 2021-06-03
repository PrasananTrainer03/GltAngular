import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		File f1 = new File("C:/sele/SeleNew/StudentProject/src/com/java/glt/Student.java");
		System.out.println("File Name  " +f1.getName());
		System.out.println("Full Name  " +f1.getPath());
		System.out.println("Parent Directory  " +f1.getParent());
		File f2 = new File("C:/sele/SeleNew/StudentProject/src/com/java/glt");
		String[] files = f2.list();
		for (String s : files) {
			System.out.println(s);
		}
	}
}
