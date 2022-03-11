package com.override.ex2;

public class Tester {
	public static void main(String[] args){
		Bank b1 = new Bank();
		Bank b2 = new Bank();
		boolean type = b2.equals(b1);
		System.out.println(type);
		
		SbiBank sb1 = new SbiBank();
		SbiBank sb2 = new SbiBank();
		boolean type1 = sb2.equals(sb1);
		System.out.println(type1);
		
		Bank b3 = new Bank();
		SbiBank sb3 = new SbiBank();
		boolean type2 = sb3.equals(b3);
		System.out.println(type2);
		
		System.out.println("********");
		Bank  b4 = new Bank();
		Rbi r1 = new Rbi();
		boolean type3 = r1.equals(b4);
		System.out.println(type3); 
		
		System.out.println("********");
		Bank b = new SbiBank();
		SbiBank bank = (SbiBank) b;
		System.out.println(bank.provideloanOnRateOfIntrest());
		bank.displayDetails(); 

		
	} 
}
