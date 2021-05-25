package com.java.glt;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List employNames = new ArrayList();
		employNames.add("Sai Kiran");
		employNames.add("Ravali");
		employNames.add("Mani");
		employNames.add("Apparao");
		employNames.add("Manoj");
		
		System.out.println("List of Names are ");
		for (Object object : employNames) {
			System.out.println(object);
		}
		
		employNames.add(3, "Srikanth");
		System.out.println("List after Adding New Name");
		for (Object object : employNames) {
			System.out.println(object);
		}
		
		employNames.set(3, "Rekha");
		System.out.println("List after Editing the Names  ");
		for (Object object : employNames) {
			System.out.println(object);
		}
		
		employNames.remove(0);
		System.out.println("Names after removing by index...");
		for (Object object : employNames) {
			System.out.println(object);
		}
		employNames.remove("Rekha");
		System.out.println("Names after removing by Object Name ");
		for (Object object : employNames) {
			System.out.println(object);
		}
	}
}
