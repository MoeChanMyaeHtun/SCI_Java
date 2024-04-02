package com.sci;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourceDemo {

	public static void main(String[] args) {
//		FileInputStream in = null;
//		FileOutputStream out = null;
//		try {
//			in = new FileInputStream("Data.txt");
//			out = new FileOutputStream("out.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		try {
//			if(in != null) {
//				in.close();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		try {
//			if(out != null) {
//				out.close();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		try (FileInputStream in = new FileInputStream("Data.txt");
				FileOutputStream out = new FileOutputStream("out.txt")){
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	class Person implements AutoCloseable, Closeable{
		public void close() throws IOException{
			
		}
	}

}
