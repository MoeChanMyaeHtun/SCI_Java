package com.sci;

public class Demo {

	public static void main(String[] args) {
		int index = 10;
		switch (index) {
		case 10:
			System.out.println("Index Value : " + index);
		break;
		case 20:
			System.out.println("Index Value : " + index);
			break;
		case 30:
			System.out.println("Index Value : " + index);
			break;
		case 40:
			System.out.println("Index Value : " + index);
			break;
		default:
			System.out.println("I don't know");
//			throw new IllegalArgumentException("Unexpected value: " + index);
		}
	}

}
