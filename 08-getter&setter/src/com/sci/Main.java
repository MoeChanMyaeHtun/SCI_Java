package com.sci;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("Bunny",21);
		Person p1 = new Person("moe",24);
		 p.setName("PKK");
		 p1.setName("Mochi");
		String pName = p.getName();
		String p1Name = p1.getName();
		
		
		
		
		System.out.println(pName);
		System.out.println(p1Name);
	}

}
