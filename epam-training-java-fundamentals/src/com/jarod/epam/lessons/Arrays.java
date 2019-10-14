package com.jarod.epam.lessons;

public class Arrays {

	public static void main(String[] args) {

		int[] arr = new int[4];
		arr[0] = 2;
		arr[2] = 99;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			
			System.out.println(i);
		}
		
		System.out.println(arr[2]);
		System.out.println(arr[0]);
		
		
		
		
		
		
		boolean[] bool = new boolean[2];
		System.out.println(bool[1]);

		
		int[] arr2 = {1, 4, -3, 0};

		
	}
}
