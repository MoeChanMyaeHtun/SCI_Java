package com.sci;

public class shop {

	public static void main(String[] args) {
		//cash = 100000;
		//menu = ?;
		//qty = ?;
		int cash = 100000;
		int menu = 2;
		int qty = 10;
		int totalAmount = 0;
		showMenu();
		if(menu == 1) {
			totalAmount = calculate("Apple", 1500, qty); 
		}else if (menu == 2){
			totalAmount = calculate("Orange", 500, qty); 
		}else{
			totalAmount = calculate("Mango", 1000, qty); 
		}
		
		System.out.println("remain amount" + (cash- totalAmount)+"MMK"); 
	}



	private static int calculate(String item , int price, int qty ) {
		int totalAmount;
		totalAmount = qty * price;
		 System.out.println(item+"=>" + qty); 
		 
		 System.out.println("amount" + totalAmount);
		return totalAmount;
	}
	
	

	private static void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. Apple -> 1500MMK");
		System.out.println("2. Orange -> 500MMK");
		System.out.println("3. Mango -> 1000MMK");
		
	}

}
