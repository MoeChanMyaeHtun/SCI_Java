package com.shop.controller;

import com.shop.dto.Item;
import java.util.Scanner;

public class ShopController {
	private static Item[] items = {new Item("Apple", 1500,200),new Item("Orange", 500, 100), new Item("Mango", 1000, 400)};
	private Scanner scan = new Scanner(System.in);
	public void open() {
//		System.out.println("shop open");
		showMenu();
		int menu = Integer.parseInt(getInput("select menu:"));
		int qty = Integer.parseInt(getInput("enter qty:"));
	}
	
	private void showMenu() {
		 for (int i=0; i< items.length; i++) {
			 System.out.println(i+1 + "." + items[i].getName()+ "=> " + items[i].getPrice()+ "MMK "+ "["+ items[i].getQuantity()+ "]");
		 }
	}
	
	private String getInput(String message) {
		System.out.print(message);
		return scan.nextLine();
	}
}
