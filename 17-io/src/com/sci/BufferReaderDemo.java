package com.sci;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class BufferReaderDemo {
	public static void main(String[] args) {
		try(BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Acer\\Desktop\\java-io\\Invoice.txt"));
				BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Acer\\Desktop\\java-io\\ExportInvoice2.txt"));
				PrintWriter pw = new PrintWriter(new File("print_export.txt"))
				) {
//				int i= 0;
			String str = null;
				while((str = in.readLine()) != null) {
					System.out.println(str);
					out.write(str);
					out.newLine();
					pw.println(str);
				}
				System.out.println("Data copied");
			} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
