package com.sci;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myanmar = 60;
		int eng = 70;
		int math = 50;
		int mark = 60;
		if (math >= mark  && eng >= mark) {
			System.out.println("pass" );
		}else if (myanmar >= mark && eng >= mark ) {
			System.out.println("pass");
		}else if (eng >= mark && math >= mark) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}

	}

}
