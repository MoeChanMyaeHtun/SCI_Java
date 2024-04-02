package com.sci.singlaton;

public class Demo {
	public static void main(String[] args) {
//		Person p = new Person("kyaw kyaw");
//		Person p1 = new Person("Zaw Zaw");
		
		Person p = Person.getInstance();
		Person p1 = Person.getInstance();
		p.setName("Kyaw Kyaw");
		p.setName("Zaw Zaw");
		System.out.println(p.getName());
		System.out.println(p1.getName());
	}
}
