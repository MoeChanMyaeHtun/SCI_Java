package com.sci;

public class Main {

	public static void main(String[] args) {
		int [] index = new int [5];
		System.out.println(index[0]);
		
		int [] nums = {20, 40, 60, 80, 100};
		System.out.println("index length :" + index.length);
		System.out.println("nums length :" + nums.length);
		System.out.println("Last index of num array  :" + nums[4]);
		
		for(int i = 3; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		for(int i : nums) {
			System.out.println(i);
		}

	}

}
