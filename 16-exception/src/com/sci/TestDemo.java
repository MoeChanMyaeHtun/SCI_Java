package com.sci;

import java.io.IOException;

public class TestDemo {
	public static void main(String[] args) {
			try {
				method_one();
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
	
		private static void method_one() throws ArithmeticException {
			method_two();
			
		}
		private static void method_two() throws ArithmeticException {
			try {
				method_three()	;
			} catch (ArithmeticException e) {
				e.printStackTrace();
			} catch (IOException | NullPointerException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		private static void method_three() throws ArithmeticException,IOException {
			System.out.println(10/0);	
			System.out.println("End!!");	
		}


}