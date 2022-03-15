package com.arrray.examples;

public class SingleDimenssionalArray {
	public static void main(String[] args) {
		
		int[] x = new int[5]; //fixed size
		x[0] = 10;
		x[1] = 23;
		x[2] = 9;
		x[3] = 88;
		x[4] = 48;
	  //x[5] = 76;            //Fixed Size
	  //x[4] = "bhargav";     //same 
		
		for(int i= 0;i<x.length;i++) {
		System.out.println(x[i]);
		}
	}
}
