package com.sci;

import java.util.GregorianCalendar;

public class TestString {

	public static void main(String[] args) {
		testStringBuilder();
		testStringBuffer();

	}

	private static void testStringBuilder() {
		System.gc();
		long start = new GregorianCalendar().getTimeInMillis();
		for (int i = 0; i < 1000000 ; i++) {
			sb.append(":").append(i);
		}
		long end = new GregorianCalendar().getTimeInMillis();
		
		
	}
	private static void testStringBuffer() {
		// TODO Auto-generated method stub
		
	}

}
