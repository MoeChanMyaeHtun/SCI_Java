package com.sci.override;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Mlutiply multi = new Mlutiply();
//		multi.calculate(10,5);
		Shape s1 = new Shape();
		s1.computeArea(10,20);
		
		Shape s2 = new Rectangle();
		s2.computeArea(10,20);
		
		Shape s3 = new Triangle();
		s3.computeArea(10,20);
		
		Shape s4 = getShape(new Rectangle());
	}
	
	public static Shape getShape(Shape s) {
		return s;
	}

}
