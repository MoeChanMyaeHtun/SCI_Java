package com.zoo;

public class Dog extends Canine implements Pet, MyInterface {

	@Override
	public void bite() {
		System.out.println("dog is bite bone");
		
	}

	@Override
	public void sleep() {
		System.out.println("dog is sleeping");
		
	}

	@Override
	public void eat() {
		System.out.println("dog is eating bone");
		
	}
	
	public void cuddle() {
		System.out.println("I can cuddle dog");
	}


}
interface MyInterface{
	
}
