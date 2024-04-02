package com.sci.singlaton;

public class Person {
	private String name;
	private static Person p;
	public Person() {
		super();
//		this.name = name;
	}
	public static Person getInstance() {
		return p = p !=null ? p : new Person();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
