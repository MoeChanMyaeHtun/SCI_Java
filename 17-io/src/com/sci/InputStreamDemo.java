package com.sci;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
public class InputStreamDemo {

	public static void main(String[] args) {
		try(FileInputStream in = new FileInputStream(new File("C:\\Users\\Acer\\Desktop\\java-io\\phyokhantkyaw.png"));
				FileOutputStream out = new FileOutputStream("C:\\Users\\Acer\\Desktop\\java-io\\phyokhantkyawsatepote.png")	
				) {
				int i= 0;
				while((i = in.read()) != -1) {
					System.out.println(i);
					out.write(i);
				}
				System.out.println("Data copied");
			} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
