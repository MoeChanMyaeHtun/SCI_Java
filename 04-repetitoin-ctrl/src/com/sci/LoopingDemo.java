package com.sci;

public class LoopingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whileLoopDemo();
		doWhileLoop() ;
	}
	private static void whileLoopDemo() {
		int i = 5;
		int loopcount =0;
				while (i< 20) {
					System.out.println(i);
					i++; //break point to stop loop.
					loopcount++;
				}
				System.out.println("loop count" + loopcount );
	}
	public static void doWhileLoop() {
		int i = 10;
		do {
			System.out.println(i + "");
			i++;
		} while (i < 10);
	}

}
