package com.java.glt.rev;

class Hello {

	public static void main(String[] args) {
	//	System.out.println("Hello...");
		int x=12;
		//System.out.println(x++);
		//System.out.println(x++ + ++x);
		
		//System.out.println(x++ + x++ + x-- + --x );
		// 12 + 13 + 14 + 12 
		
		
		System.out.println(x++ + ++x + x++ + --x + x-- + --x);
		// 12+14 + 14 + 14 + 14 + 12
		
	}
}
