package com.override.ex;

public class HDFC extends ICICI {
	public static final float RATE_OF_INTREST = 14.5F;
 
	@Override
	public void displayRateOfIntrest() {
	 System.out.println("Rate of intrest of HDFC is "+RATE_OF_INTREST);
 }
}
