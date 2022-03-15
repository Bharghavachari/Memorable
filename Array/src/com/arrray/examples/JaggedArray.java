package com.arrray.examples;

public class JaggedArray {
	public static void main (String[] args) {
		int[][]jarr = new int[3][];
		jarr[0] = new int[4];
		jarr[1] = new int[3];
		jarr[2] = new int[2];
		
		
		int ct = 10;
		for(int i=0;i<jarr.length;i++) {
			for(int j=0;j<jarr[i].length;j++) {
				jarr [i][j]= ct;
				ct+=10;
			}
		}
		for(int i=0;i<jarr.length;i++) {
			for(int j=0;j<jarr[i].length;j++) {
				System.out.print(jarr[i][j]+" ");
				}
		System.out.println();
		}
	}
}
