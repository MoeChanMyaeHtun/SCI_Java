package com.sci.override;

public class Triangle extends Shape{
	public void computeArea(int width, int height) {
		System.out.println("Triangle Area : "+ (width * height)*0.5);
	}
	
	public void callComputeAreaMethod() {
		this.callComputeAreaMethod();
	}
}
