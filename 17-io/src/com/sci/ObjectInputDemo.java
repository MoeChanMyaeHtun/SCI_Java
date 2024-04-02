package com.sci;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ObjectInputDemo {
	List<Person> plist = List.of(new Person("kyaw kyaw"), new Person("Zaw Zaw"));
	try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.obj"))){
		plist = (List<Person>) in.readObject();
		for(Person p : plist) {
			
		}
		System.out.println();
	} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("data copied");
}
}
