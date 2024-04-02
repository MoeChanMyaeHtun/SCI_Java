package com.sci;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataOutputStreamDemo {
	private static String[] names = {"phyo phyo","phyo khant","phyo khant kyaw"};
	private static int[] ages = {21,22,23};
	private static double[] salary = {155,165,205};
	public static void main(String[] args) {
		try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("data.obj"));) {
			for (int i = 0; i < names.length; i++) {
				dataOut.writeUTF(names[i]);
				dataOut.writeInt(ages[i]);
				dataOut.writeDouble(salary[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("data copied");
	}
}
