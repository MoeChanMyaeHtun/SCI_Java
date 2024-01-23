package com.sci;

public class LogicalOpt {
	public static void main(String[] args) {
	int i = 10;
	int j = 20;
	int k = 30;
	int n = 40;
	boolean b1 = (i < j) && (k > n);
	System.out.println("(i < j )  && (k > n) : " + b1);
	
	boolean b2 = (i < j) && (k < n);
	System.out.println("(i < j )  && (k > n) : " + b2);
	
	
	}
}
