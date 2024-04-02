package com.sci;

public class AfterEnum {

	public static void main(String[] args) {
		Days day = Days.Monday;
		switch(day) {
		case Monday:
			System.out.println(Days.Monday);
			break;
		case Tueday:
		System.out.println(Days.Tueday);
		break;
		case Wednesday:
		System.out.println(Days.Wednesday);
		break;
		}
		System.out.println(Days.Monday.ordinal());
		System.out.println(Days.Monday.name());
	}

}
enum Days{
	//we can't make instance of enum.
	//access modifier of constructor of enum is always private.
	//enum can implements interface
	//enum can define abstract method
	//ordinal no. of enum starts with zero.
	//enum is type safe.
	Monday, Tueday, Wednesday;
	public String toString() {
		return (ordinal()+1) + "." +name();
	}
}
