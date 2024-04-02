package com.sci;

public class BeforeEnum {
	private static final int MON = 1, TUE = 2, WED = 3;
	public static void main (String[] args) {
		int day = MON;
		day = 5;
		 switch (day) {
         case MON:
             System.out.println("Monday");
             break;
         case TUE:
             System.out.println("Tuesday");
             break;
         case WED:
             System.out.println("Wednesday");
             break;
         default:
             System.out.println("Invalid day");
		 }
	}
}
