package com.java.abs;

abstract class Flight {
	public abstract void ticket();
	public abstract void idProof();
}

class SaiKiran extends Flight {

	@Override
	public void ticket() {
		System.out.println("I Have Busines Class Ticket");
	}

	@Override
	public void idProof() {
		System.out.println("Hi I have Aadhar Id Proof...");
	}
}

class Ravali extends Flight {

	@Override
	public void ticket() {
		System.out.println("Hi I am Ravali...I have Business Class Ticket...");
	}

	@Override
	public void idProof() {
		System.out.println("Hi I have Voter ID card...");
	}
	
}
class Mani extends Flight {

	@Override
	public void ticket() {
		System.out.println("Hi I am having Executive Class Ticket...");
	}

	@Override
	public void idProof() {
		System.out.println("HI I have Driving Liscence");
	}
}

public class AbsTest {
	public static void main(String[] args) {
		Flight[] arr = new Flight[] {
			new Mani(),
			new Ravali(),
			new SaiKiran()
		};
		for (Flight flight : arr) {
			flight.idProof();
			flight.ticket();
		}
	}
}
