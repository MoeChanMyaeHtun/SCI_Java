	public class ShoppingCart {
	    private int cash;
	    private int totalAmount;

	    public ShoppingCart(int cash) {
	        this.cash = cash;
	        this.totalAmount = 0;
	    }

	    public void addItem(int menu, int qty) {
	        int price = 0;
	        String item = "";

	        if (menu == 1) {
	            item = "Apple";
	            price = 1500;
	        } else if (menu == 2) {
	            item = "Orange";
	            price = 500;
	        } else {
	            item = "Mango";
	            price = 1000;
	        }

	        totalAmount += calculate(item, price, qty);
	    }

	    public void displayRemainingAmount() {
	        System.out.println("Remaining amount => " + (cash - totalAmount) + " Ks");
	    }

	    private int calculate(String item, int price, int qty) {
	        int itemTotalAmount = qty * price;
	        System.out.println(item + " Total Amount => " + itemTotalAmount + " Ks");
	        return itemTotalAmount;
	    }
	
	}
