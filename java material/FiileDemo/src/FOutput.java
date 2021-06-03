import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOutput {
	public static void main(String[] args) {
		try {
			FileInputStream fin = 
					new FileInputStream("C:/sele/SeleNew/StudentProject/src/com/java/glt/Student.java");
			FileOutputStream fout = 
					new FileOutputStream("C:/files/studentNew.java");
			int ch;
			while((ch=fin.read()) != -1) {
				fout.write((char)ch);
			}
			fin.close();
			fout.close();
			System.out.println("*** File Copied Successfully ***");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
