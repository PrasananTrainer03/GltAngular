package com.java.glt.rev;

public class PosNeg {

	public void check(int n) {
		if (n >= 0) {
			System.out.println("Positive Number...");
		} else {
			System.out.println("Negative Number...");
		}
	}
	public static void main(String[] args) {
		int n=5;
		new PosNeg().check(n);
	}
}
