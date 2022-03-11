package com.exception.machine;

public class Machine {
	
	public void withdraw(int Amount) {
		if(Amount > 20000 || Amount <100 || Amount % 100!=0) {
			throw new ArithmeticException();
		}
		
		else {
			System.out.println(" Collect the Cash");
		}
	}
}
