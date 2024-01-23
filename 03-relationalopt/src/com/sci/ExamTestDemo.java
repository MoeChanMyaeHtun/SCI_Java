package com.sci;

public class ExamTestDemo {
	public static void main(String[] args) {
		markOver40();
		boolean b1 = getFalse() && getTrue() && getTrue();
		boolean b2 = getFalse() || getTrue();
		
	}

	public static void markOver40() {
		int mark = 40 ;
		System.out.println("pass:" +(mark >= 40));
		System.out.println("Fail:" +(mark < 40));
		
		int mark2 = 39 ;
		System.out.println("pass:" + !(mark >= 40));
		System.out.println("Fail:" + !(mark < 40));
	}
	public static boolean getFalse() {
		return false;
	}
	public static boolean getTrue() {
		return true;
	}
}
