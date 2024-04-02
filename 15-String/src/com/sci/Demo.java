package com.sci;

import java.util.Objects;

public class Demo {

	public static void main(String[] args) {
		 Demo demo = new Demo();
		String str = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		
		Person p2 = demo.new Person("Khant");
		Person p3 = demo.new Person("Khant");
		
		
		
		
		System.out.println("str == str2"+(str == str2));
		System.out.println("str2 == str3"+(str2 == str3));
		System.out.println("str3 == str4"+(str3 == str4));
		
		System.out.println("str.equals(str2)"+(str.equals(str2)));
		System.out.println("str2.equals(str3)"+(str2.equals(str3)));
		System.out.println("str3.equals(str4)"+(str3.equals(str4)));
		
		System.out.println("str memory"+System.identityHashCode(str));
		System.out.println("str2 memory"+System.identityHashCode(str2));
		System.out.println("str3 memory"+System.identityHashCode(str3));
		System.out.println("str4 memory"+System.identityHashCode(str4));
		System.out.println("p == p2"+(p2 == p3));
		System.out.println("p.equals(p2)"+(p2.equals(p3)));
		
	}
	class Person{
		private String name;
		public Person(String name) {
			super();
			this.name = name;
			
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(name);
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(name, other.name);
		}
		private Demo getEnclosingInstance() {
			return Demo.this;
		}
		
	}

}
