package com.sci;

public class TwoDimensionl {

	public static void main(String[] args) {
		String[][] actors = new String[3][2];
		actors[0][0] = "Keanu";
		actors[0][1] = "Reeves";
		actors[1][0] = "Tom";
		actors[1][1] = "Hanks";
		actors[2][0] = "Johnny";
		actors[2][1] = "Deep";
		
		System.out.println("Row Length: " + actors.length);
		System.out.println("Column Length: " + actors[0].length);
		
		for(int i = 0; i < actors.length; i++) {
			for (int j = 0; j <actors[i].length; j++) {
				System.out.println(actors[i][j] + "");
			}
			System.out.println();
		}

	}

}
