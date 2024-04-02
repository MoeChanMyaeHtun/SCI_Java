package com.sci;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		List<String> sList = new ArrayList<>();
		printWithWildCard(set);
		printWithWildCard(sList);
	}
	public static void printData(Collection<Object> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
	public static void printWithWildCard(Collection<?> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
