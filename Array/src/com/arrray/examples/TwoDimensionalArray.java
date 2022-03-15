package com.arrray.examples;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int [][] arr = new int[5][5];      //[5][5]multiply 25 Size 
		int count = 5;
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=count;
				count+=10;
			}
			}
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();       //matrixform 
		}
		
	}
}
