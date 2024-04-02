package com.zoo;

public interface Pet {
	int i = 10;
	void cuddle();
	
	private void print() {
		
	}
	
	public default void show() {
		print();
	}
	
	public static void test () {
		
	}
}
abstract class MyAbstract implements Pet{
	
}

class MyClass implements Pet{
	
	@Override
	public void cuddle() {
		
	}
}