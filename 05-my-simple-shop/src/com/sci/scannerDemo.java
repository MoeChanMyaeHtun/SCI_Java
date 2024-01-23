package com.sci;

import java.util.Scanner;

public class scannerDemo {
	//wrapper type(8)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enater Your Name:");
		int age = scan.nextInt();
		System.out.println("Hello:" + age);
	}

}
