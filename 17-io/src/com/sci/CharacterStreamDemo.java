	package com.sci;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
public class CharacterStreamDemo {

		public static void main(String[] args) {
			try(FileReader in = new FileReader(new File("C:\\Users\\Acer\\Desktop\\java-io\\phyokhantkyaw.png"));
					FileWriter out = new FileWriter("C:\\Users\\Acer\\Desktop\\java-io\\yotesoe.png")	
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

