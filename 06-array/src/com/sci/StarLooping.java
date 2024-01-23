package com.sci;

public class StarLooping {

	public static void main(String[] args) {
		loopOne();
		System.out.println();
		loopTwo();

	}

//	*
//	**
//	***
//	****
//	*****
	private static void loopOne() {
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	*****
//	****
//	***
//	**
//	*
	private static void loopTwo() {
		for(int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
