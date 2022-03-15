package com.arrray.examples;

import java.util.Scanner;

public class ArrayScan {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner user = new Scanner(System.in);
		int n = user.nextInt();
		
		String [] str =  new String[n];
		for(int i=0;i<str.length;i++) {
		str[i]=user.next();
		System.out.println("Enter the string Array element");
		}
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}
}
