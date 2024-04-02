package com.multiInterface;

public interface MyInterface2 {
	void print();
	public default void show() {
		
	}
}
interface MyInterface3{
	void print();
	public default void show() {
		
	}
}
interface MyInterface4 extends MyInterface2, MyInterface3{
	default void show() {
		MyInterface3.super.show();
		MyInterface2.super.show();
	}
}
