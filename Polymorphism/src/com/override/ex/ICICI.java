package com.override.ex;

public class ICICI extends RBI {
	public static final float RATE_0F_INTREST = 12.5f;
	
	@Override
	public void displayRateOfIntrest() {
		System.out.println("Rate of intrest of ICICI is "+RATE_0F_INTREST );
	}
}
