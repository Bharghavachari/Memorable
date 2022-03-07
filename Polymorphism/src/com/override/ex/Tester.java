package com.override.ex;

public class Tester {
 public static void main (String args[]) {
	 
	 RBI rbi = new RBI();
	 rbi.displayRateOfIntrest();
	 
	 ICICI ic = new ICICI();
	 ic.displayRateOfIntrest();
	 
	 HDFC hdfc = new HDFC();
	 hdfc.displayRateOfIntrest();
	 
	 System.out.println("*************");
	 
	 System.out.println("RBI Over");
	 RBI rbi1 = new ICICI();
	 rbi1.displayRateOfIntrest();
	 
	 System.out.println("RBI Over");
	 RBI rbi2 = new HDFC();
	 rbi2.displayRateOfIntrest();
	 
 }
}
