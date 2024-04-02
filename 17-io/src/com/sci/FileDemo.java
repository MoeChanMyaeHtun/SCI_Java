package com.sci;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Acer\\Desktop\\java-iodataInput.txt");
		System.out.println("file exists: " + file.exists());
		System.out.println("file exists: " + file.createNewFile());
		System.out.println("file exists: " + file.exists());
	}

}
