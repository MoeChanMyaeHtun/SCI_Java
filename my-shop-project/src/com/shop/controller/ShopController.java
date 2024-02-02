package com.shop.controller;

import java.util.Scanner;

import com.shop.dto.Item;

public class ShopController {
	private static Item[] items = { new Item("Apple", 1500, 200),
								   new Item("Orange", 500, 100),
								   new Item("Mango", 1000, 400)};
	
	private Scanner scanner = new Scanner (System.in);
	
	public void open() {
	    showMenu();
	    int menu = 0;
	    int qty = 0;
	    String addMenu = "N"; 
	    int totalAmount = 0;
	    int payment = 0;
	    int change = 0;

	    menu = Integer.parseInt(getInput("Select menu : "));
	    qty = Integer.parseInt(getInput("Enter quantity : "));
	    if (qty <= items[menu - 1].getQuantity()) {
	    	addMenu = getInput("Do you want another fruit? (Y/N) : ");
	    	if(addMenu.equalsIgnoreCase("y")) {
	    		 remainInstock(qty, menu);
	    		 menu = Integer.parseInt(getInput("Select menu : "));
	    		 qty = Integer.parseInt(getInput("Enter quantity : "));
			        if (qty <= items[menu - 1].getQuantity()) {
			            addMenu = getInput("Do you want another fruit? (Y/N) : ");
			            addMenus (qty, menu, totalAmount, payment, change, addMenu) ;
			            
			        } else {
			        	 System.out.println("Insufficient quantity. Please select a lower quantity.");
			             addMenu = getInput("Do you want another fruit? (Y/N) : ");
			             showMenu();
			             menu = Integer.parseInt(getInput("Select menu : "));
			    		    qty = Integer.parseInt(getInput("Enter quantity : "));
			    		    addMenu = getInput("Do you want another fruit? (Y/N) : ");
			    		    if(addMenu.equalsIgnoreCase("y")) {
			    	    		 remainInstock(qty, menu);
			    	    		 menu = Integer.parseInt(getInput("Select menu : "));
			    	    		 qty = Integer.parseInt(getInput("Enter quantity : "));
			    			        if (qty <= items[menu - 1].getQuantity()) {
			    			            addMenu = getInput("Do you want another fruit? (Y/N) : ");
			    			            addMenus (qty, menu, totalAmount, payment, change, addMenu) ;
			    			        } else {
			    			        	totalAmount+=calculate(qty, menu);
			    			        	 finalCalculate(totalAmount, qty, menu);
			    			        }
			    	    	}else {
			    	    		
			    	    		totalAmount += calculate(qty, menu);
			    	        	 finalCalculate(totalAmount, qty, menu);
			    	    	}
			        }
	    	}else {
	    		 totalAmount=calculate(qty, menu);
	    		  System.out.println("Total Amount : " + totalAmount);
	    	}
	       	        
	    }else {
	    	qtyLow(addMenu,  menu,  qty,totalAmount,payment,change) ;
	    }
	}
	
	public void qtyLow(String addMenu, int menu, int qty, int totalAmount,int payment,int change) {
		 System.out.println("Insufficient quantity. Please select a lower quantity.");
         addMenu = getInput("Do you want another fruit? (Y/N) : ");
         showMenu();
         menu = Integer.parseInt(getInput("Select menu : "));
		    qty = Integer.parseInt(getInput("Enter quantity : "));
		    addMenu = getInput("Do you want another fruit? (Y/N) : ");
		    if(addMenu.equalsIgnoreCase("y")) {
	    		 remainInstock(qty, menu);
	    		 menu = Integer.parseInt(getInput("Select menu : "));
	    		 qty = Integer.parseInt(getInput("Enter quantity : "));
			        if (qty <= items[menu - 1].getQuantity()) {
			            addMenu = getInput("Do you want another fruit? (Y/N) : ");
			            addMenus (qty, menu, totalAmount, payment, change, addMenu) ;
			        } else {
			        	totalAmount+=calculate(qty, menu);
			        	 finalCalculate(totalAmount, qty, menu);
			        }
	    	}else {
	    		
	    		totalAmount += calculate(qty, menu);
	        	 finalCalculate(totalAmount, qty, menu);
	    	}
	}
	public void showMenu() {
		for(int i = 0; i < items.length; i++) {
			System.out.println(i+1 + "." + items[i].getName() + " => " + items[i].getPrice() + "MMK " + "[ " + items[i].getQuantity() + "]");
		}
	}
		
	
	private String getInput(String message) {
		System.out.print(message);
		return scanner.nextLine();
	}
	
	public int calculate(int qty, int menu) {
		int totalAmount = qty*items[menu-1].getPrice();
		 return totalAmount;
	}
	public void remainInstock(int qty , int menu) {
		items[menu-1].setQuantity(items[menu-1].getQuantity() - qty);
		for(int i = 0; i < items.length; i++) {
			System.out.println(i+1 + "." + items[i].getName() + " => " + items[i].getPrice() + "MMK " + "[ " + items[i].getQuantity() + "]");
		}
	}
	
	public int checkOut(int payment, int totalAmount) {
	    int change = payment - totalAmount;
	    return change;
	}
	
	public void addMenus (int qty, int menu, int totalAmount, int payment, int change, String addMenu) {
        if (addMenu.equalsIgnoreCase("y")) {
            do {
            	remainInstock(qty, menu);
                menu = Integer.parseInt(getInput("Select menu : "));
                qty = Integer.parseInt(getInput("Enter quantity : "));

                if (menu >= 1 && menu <= items.length && qty > 0 && qty <= items[menu - 1].getQuantity()) {
                    addMenu = getInput("Do you want another fruit? (Y/N) : ");
                    totalAmount += calculate(qty, menu);

                    if (addMenu.equalsIgnoreCase("y")) {
                        remainInstock(qty, menu);
                    }
                } 
            } while (addMenu.equalsIgnoreCase("y"));
            System.out.println("here3");
            finalCalculate(totalAmount, qty, menu);
        }else {
        	 totalAmount += calculate(qty, menu);
        	finalCalculate(totalAmount, qty, menu);
        }
        
	}
        
	public void finalCalculate(int totalAmount, int qty, int menu) {
		System.out.println("here4");
		 totalAmount += calculate(qty, menu);
	    System.out.println("Total Amount : " + totalAmount);

	    int payment = Integer.parseInt(getInput("Payment : "));
	    int change = checkOut(payment, totalAmount);

	    if (payment < totalAmount) {
	        System.out.println("Sorry, additional payment needed.");
	        payment = Integer.parseInt(getInput("Additional Payment : "));
	        change = checkOut(payment, totalAmount);
	    }

	    System.out.print("Change Due : " + change);
	    System.out.println("Thank You");
	}
}
