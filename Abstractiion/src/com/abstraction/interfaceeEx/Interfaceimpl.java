package com.abstraction.interfaceeEx;

public class Interfaceimpl implements Car,Jeep {

	@Override
	public void Price() {
		System.out.println("Involked Price Method");
		
	}

	@Override
	public void Speed() {
		System.out.println("Involked Speed Method");
		
	}

	@Override
	public void Type() {
		System.out.println("Involked Type Method");
		
	}
	
}
