package com.sci;
import java.util. Comparator;
		public class SortPerson {
		public static class SortByName implements Comparator<Person>
		{
		@Override
		public int compare(Person p1, Person p2) {
		return p1.getName().compareToIgnoreCase(p2.getName());
		}
		}
		public static final class SortByID implements Comparator<Person> {
		@Override
		public int compare(Person p1, Person p2) {
		return p1.getId() - p2.getId();
		}
		}
		//inner class
		public class SortBySalary implements Comparator<Person>
		{
		@Override
		public int compare(Person p1, Person p2) {
		return p1.getSalary() - p2.getSalary();
		}
		}
		public class SortByAge implements Comparator<Person> {
		@Override
			public int compare(Person p1, Person p2) {
				return p1.getAge() - p2.getAge();
			}
		}
	}