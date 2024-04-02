package com.sci;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AfterGeneric {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("java");
//		list.add(50);
//		list.add(new Date());
		for (String str : list) {
			System.out.println(str);
		}
	}

}
