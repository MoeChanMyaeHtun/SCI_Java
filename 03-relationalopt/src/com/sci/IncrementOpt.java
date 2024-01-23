package com.sci;

public class IncrementOpt {

	public static void main(String[] args) {
		preInc();
		postInc();

	}
	public static void preInc() {
		int i = 10;
		int j = 12;
		 int k = ++i + j;
		 System.out.println("preincrement:" + k);
		
	}
public static void postInc() {
	int i = 10;
	int j = 12;
	 int k = i++ + j;
	 System.out.println("postincrement:" + k);
	 System.out.println("ivalue: "+ i);
		
	}
}
