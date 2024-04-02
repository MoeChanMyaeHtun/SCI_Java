package com.zoo;

public class Cat extends Feline implements Pet  {

	@Override
	public void scratch() {
		System.out.println("cat is scratch");
		
	}

	@Override
	public void sleep() {
		System.out.println("cat is sleeping");
		
	}

	@Override
	public void eat() {
		System.out.println("cat is eating");
		
	}
	
	public void cuddle() {
		System.out.println("I can cuddle cat");
	}

}
