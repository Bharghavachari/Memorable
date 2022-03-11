package com.override.ex2;

public class Bank {
	public String BranchName = "JayaNagar";
	public String IfscCode = "RBI2245";
	public int noOFBranch = 40;
	
	public Bank() {
	}
	
	public Object provideloanOnRateOfIntrest() {
		return "10.52";
		}

	@Override
	public boolean equals(Object bank) {
		if(bank instanceof Bank) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
