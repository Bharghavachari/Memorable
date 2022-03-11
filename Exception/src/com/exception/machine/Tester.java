package com.exception.machine;

public class Tester {
	public static void main  (String[] args) {
		
		Machine machine = new Machine();
		
		try {
			machine.withdraw(1000);
			
		}
		catch(ArithmeticException  e) {
			System.out.println(e.getMessage());
		
		}
	}
	
}
