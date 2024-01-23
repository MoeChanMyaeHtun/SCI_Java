package com.sci;

import java.util.Scanner;

public class scannerShop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int totalAmount = 0;
		System.out.print("Enter cash: ");
		int cash = scanner.nextInt();
		System.out.println("Cash amount: " + cash + "Ks");
		System.out.print("Enter Menu: ");
		int menu = scanner.nextInt();
		System.out.print("Enter qty: ");
		int qty = scanner.nextInt();
		if(menu == 1) {
			totalAmount = calculate("Apple", 1500, qty); 
		}
		else if(menu == 2) {
			totalAmount = calculate("Orange", 500, qty); 
		}
		else{
			totalAmount = calculate("Mango", 1000, qty); 
		}
		System.out.println("remain amount => " + (cash- totalAmount)+" Ks"); 
		scanner.close();
	}

	private static int calculate(String item, int price, int qty) {
		 int totalAmount = qty * price;
		 System.out.println(item +"Total Amount =>" + totalAmount + "Ks");
	        return totalAmount;
	}

}
