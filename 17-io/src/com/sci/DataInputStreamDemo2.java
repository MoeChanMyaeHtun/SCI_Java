package com.sci;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo2 {
	private static String[] names = {"phyo phyo","phyo khant","phyo khant kyaw"};
	private static int[] ages = {21,22,23};
	private static double[] salary = {155,165,205};
	public static void main(String[] args) {
		try(DataInputStream in = new DataInputStream(new FileInputStream("data.obj"));) {
			String name = null;
			int ages = 0;
			double salary = 0;
//			while(in.read() != -1) {
			for(int i = 0 ; i < 3;i++) {
				 name = in.readUTF();
				ages = in.readInt();
				 salary = in.readDouble();
		
				
				System.out.println(name);
				System.out.println(ages);
				System.out.println(salary);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("data copied");
	}
}
