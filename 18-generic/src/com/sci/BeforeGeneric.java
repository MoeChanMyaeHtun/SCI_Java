package com.sci;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class BeforeGeneric {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Hello");
		list.add("java");
		list.add(50);
		list.add(new Date());
		for (Object obj : list) {
			String str = (String) obj;
			System.out.println(obj);
		}
	}

}
