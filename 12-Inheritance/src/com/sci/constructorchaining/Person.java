package com.sci.constructorchaining;

public class Person {
	public Person() {
		super();
		System.out.println("Person :: no arg Const");
	}
	public Person(String name) {
		this();
		System.out.println("Person :: Const");
	}
}
