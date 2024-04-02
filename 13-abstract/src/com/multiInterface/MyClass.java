package com.multiInterface;

public class MyClass implements MyInterface{
	@Override
	public void show() {
		
	}
}
class A implements MyInterface{
	@Override
	public void show() {
		
	}
	
	@Override
	public void methodForAandB() {
		
	}
}
class B implements MyInterface{
	@Override
	public void show() {
		
	}
	
	@Override
	public void methodForAandB() {
		
	}
}

interface MyInterface{
	void show();
	public default void methodForAandB();
}