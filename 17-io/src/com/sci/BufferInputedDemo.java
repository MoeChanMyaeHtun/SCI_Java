package com.sci;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferInputedDemo {
	public static void main(String[] args) {
		try(BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\Acer\\Desktop\\java-io\\phyokhantkyaw.png"));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:\\Users\\Acer\\Desktop\\java-io\\satepote.png"))	
				) {
				int i= 0;
				while((i = in.read()) != -1) {
					out.write(i);
				}
				System.out.println("Data copied");
			} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
