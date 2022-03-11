package com.exception.watsapp;

public class WatsappException extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "Cant create group more than 5 members";
	}
	public String toString() {
		return "Cant upload a file , its morethan 1 gb";
	}
}
