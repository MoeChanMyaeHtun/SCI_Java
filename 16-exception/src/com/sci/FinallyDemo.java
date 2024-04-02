package com.sci;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FinallyDemo {

	public static void main(String[] args) {
		FileInputStream io = null;
		FileOutputStream ou = null;
		try {
			System.out.println(10/0);
			 io = new FileInputStream("input.txt");
			 ou = new FileOutputStream("output.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
//			System.out.println("it works");
			if(io != null) {
				try {
					io.close();
				} catch (Exception e) {
					throw new RuntimeException();
				}
			}
			if(ou != null) {
				try {
					ou.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
