package com.sci;

public class HomeWork {

	public static void main(String[] args) {
		loopZero();
		System.out.println();
		loopOne();
		System.out.println();
		loopTwo();
	}
//	0
//	00
//	000
//	0000
//	00000
	private static void loopZero() {
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("0");
			}
			System.out.println();
		}
	}
//	1
//	12
//	123
//	1234
//	12345
	
	private static void loopOne() {
		 for(int i = 1; i <= 5; i++) {
			 for (int j = 1; j <= i; j++) { 
				 System.out.print(j);
			 }
			 System.out.println();
		 }
	}
//	11111
//	2222
//	333
//	44
//	5
	private static void loopTwo() {
		for(int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i ; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	
	
}
