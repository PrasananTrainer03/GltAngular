package com.java.glt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("C:/sele/ExTopic/CollectionExample/src/com/java/glt/SetDemo.java");
			Scanner sc = new Scanner(fin);
			String str="";
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
