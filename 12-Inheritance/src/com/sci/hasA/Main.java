package com.sci.hasA;


public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("phyo",20,new Address("21","Hlaning","YGN"));
		System.out.println(s1);
		Teacher t1 = new Teacher("phyo",20,new Address("21","Hlaning","YGN"));
		System.out.println("Name : "+ s1.getName());
		System.out.println("age : "+ s1.getAge());
	}

}
