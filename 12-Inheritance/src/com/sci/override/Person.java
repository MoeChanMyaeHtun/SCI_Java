package com.sci.override;

public class Person {
	protected Person getP(Person p) {
		return p;
	}
}

class Student extends Person{
	public Student getP(Person p) {
		return (Student)p;
	}
}

class Unistudent extends Person {
	public Unistudent getP(Person p) {
		return (Unistudent)p;
	}
}
