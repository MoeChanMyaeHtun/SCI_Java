package com.sci.constructorchaining;

public class Demo {

	public static void main(String[] args) {
		Manager m = new Manager ("phyo ",23);
		System.out.println(m);
		
		Employee e1 = new Manager ("phyo khant ",23);
		System.out.println(e1.getName());
		System.out.println(e1.getAge());

	}

}
