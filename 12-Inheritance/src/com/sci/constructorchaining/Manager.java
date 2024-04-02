package com.sci.constructorchaining;

public class Manager extends Employee {

	public Manager(String name, int age) {
		super(name,age);
		System.out.println("Person :: no arg Const");
	}
	public String toString()	{
		return super.toString();
	}
}
