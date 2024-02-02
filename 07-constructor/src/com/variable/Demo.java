package com.variable;

public class Demo {

	public static void main(String[] args) {
		Person.salary = 10000;
		Person.print();
		
		Person p = new Person();
		p.name ="phyo";
		p.age = 20;
		p.show();

	}

}
