import java.util.Arrays;
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {  
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter cash: ");
	        int cash = scanner.nextInt();

	        ShoppingCart shoppingCart = new ShoppingCart(cash);

	        System.out.println("Cash amount: " + cash + " Ks");

	        System.out.print("Enter Menu: ");
	        int menu = scanner.nextInt();

	        System.out.print("Enter qty: ");
	        int qty = scanner.nextInt();

	        shoppingCart.addItem(menu, qty);

	        shoppingCart.displayRemainingAmount();

	        scanner.close();
	    }
	}


