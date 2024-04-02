package com.sci;

public class ExpectionDemo {

	public static void main(String[] args) {
		method_one();

	}

	private static void method_one() {
		method_two();
		
	}
	private static void method_two() {
		method_three()	;	
	}
	private static void method_three() {
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("End!!");	
	}

}
