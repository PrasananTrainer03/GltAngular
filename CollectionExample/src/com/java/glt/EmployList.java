package com.java.glt;

import java.util.ArrayList;
import java.util.List;

public class EmployList {

	public static void main(String[] args) {
		List employList = new ArrayList();
		employList.add(new Employ(1, "Sai Kiran", 82344));
		employList.add(new Employ(2, "Apparao", 92344));
		employList.add(new Employ(3, "Manikanta", 87344));
		employList.add(new Employ(4, "Ravali", 81144));
		employList.add(new Employ(5, "Manoj", 84444));
		employList.add(new Employ(6, "Srikanth", 87544));
		
		for (Object object : employList) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
	}
}
