package com.sci;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ObjectOutputDemo {
	public static void main(String[] args) {
	List<Person> plist = List.of(new Person("kyaw kyaw"), new Person("Zaw Zaw"));
	try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.obj"))){
		out.writeObject(plist);
		System.out.println();
	} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("data copied");
}
}
