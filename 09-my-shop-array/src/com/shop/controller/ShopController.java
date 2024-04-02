package com.shop.controller;

import com.shop.dto.Item;
import java.util.Scanner;

public class ShopController {
	private static Item[] items = {new Item("Apple", 1500,200),new Item("Orange", 500, 100), new Item("Mango", 1000, 400)};
	private Scanner scan = new Scanner(System.in);
	private static int amount = 0;
	
	public void open()
	{
		
		String ans;
		do {
		showMenu();
		int menu = Integer.parseInt(getInput("Select Menu :"));
		int qty = Integer.parseInt(getInput("Enter Qty :"));
		if (qty <= items[menu - 1].getQuantity()) {
		// can sale
		amount += sale(menu, qty);
		} else {
		// out of stock
			if (items[menu-1].getQuantity() <= 0) {
			System.out.println("Sorry, We are out of stock.");
			}
			else {
				if (getInput("Sorry, We have only " + items[menu-1].getQuantity() +"left.\ndo you want all of it? Y/N").equalsIgnoreCase("Y")) {
			amount =sale(menu,items[menu -1].getQuantity());
			}
			}}
			ans = getInput("Do you want other fruit? Y/N ");
			} while (ans.equalsIgnoreCase("Y"));
			
			System.out.println("Total Amount : " + amount + " MMK");
			int refund = payment();
			System.out.println("Refund : " + refund+ "MMK");
		}
		
	// recursion -> call method itself.
	private int payment() {
		int paidAmount = 0;
		paidAmount += Integer.parseInt(getInput("Enter Amount : "));
		if (paidAmount <= amount) {
		System.out.println("Need To Pay :"+  (amount - paidAmount) + " MMK");
		payment();
		}
		return paidAmount - amount;
	}

	private int sale(int menu, int qty) {
		int amount =qty* items[menu - 1].getPrice();
		items[menu-1].setQuantity(items[menu-1].getQuantity() - qty);
		return amount;
	}
	private void showMenu() {
		 for (int i=0; i< items.length; i++) {
//			 System.out.println(i+1 + "." + items[i].getName()+ "=> " + items[i].getPrice()+ "MMK "+ "["+ items[i].getQuantity()+ "]");
		 System.out.printf("%d.%s => %d MMK [%d]%n", i+1,items[i].getName(), items[i].getPrice(), items[i].getQuantity() );
		 }
	}
	
	
	private String getInput(String message) {
		System.out.print(message);
		return scan.nextLine();
	}
}
