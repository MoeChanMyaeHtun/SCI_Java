package com.sci.typecast;

public class Main {
	public static void main(String[] args) {
	Person p1 = new Student();
	Person p2 = new Teacher();
	
	
	
	
	if (p1 instanceof Student) {
		Student s1 = (Student) p1;
		System.out.println("p1 is instance of student");
	}
	if (p2 instanceof Student) {
		Student s2 = (Student) p2;
		System.out.println("p2 is instance of student");
	}
	if (p1 instanceof Teacher) {
		Teacher t1 = (Teacher) p1;
		System.out.println("p1 is instance of teacher");
	}
	if (p2 instanceof Teacher) {
		Teacher t2 = (Teacher) p2;
		System.out.println("p2 is instance of teacher");
	}
	}
}
