package com.java.glt;

import java.util.ArrayList;
import java.util.List;

public class ListIntDemo {

	public static void main(String[] args) {
		List nums = new ArrayList();
		nums.add(new Integer(42));
		nums.add(new Integer(12));
		nums.add(new Integer(72));
		nums.add(new Integer(24));
		nums.add(new Integer(19));
		int sum=0;
		for (Object object : nums) {
			sum+=(Integer)object;
		}
		System.out.println("Sum is  " +sum);
	}
}
