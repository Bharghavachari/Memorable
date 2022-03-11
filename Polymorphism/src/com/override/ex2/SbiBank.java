package com.override.ex2;

public class SbiBank extends Bank {
	public String BranchName = "JpNagar";
	public String IfscCode = "RBI2265";
	public int NoOFBranch = 30;
	
	@Override
	public Object provideloanOnRateOfIntrest() {
		return "12.62";
		}

	public void displayDetails() {
		System.out.println("JpNagar");
		System.out.println("RBI2265");
		System.out.println(40);
		
	}

	
}
