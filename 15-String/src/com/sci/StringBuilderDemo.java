package com.sci;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		
		System.out.println("sb memory : "+System.identityHashCode(sb));
		sb.append("World");
		System.out.println("sb memory : "+System.identityHashCode(sb));

	}

}
