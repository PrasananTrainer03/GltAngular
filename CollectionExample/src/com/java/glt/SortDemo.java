package com.java.glt;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {

	public static void main(String[] args) {
		SortedSet data = new TreeSet();
		data.add("Sai Kiran");
		data.add("Manikanta");
		data.add("Ravali");
		data.add("Manoj");
		data.add("Apparao");
		data.add("Naresh");
		data.add("Srikanth");
		data.add("Rekha");
		data.add("Pravin");
		System.out.println("Sorted Data  ");
		for (Object object : data) {
			System.out.println(object);
		}
	}
}
