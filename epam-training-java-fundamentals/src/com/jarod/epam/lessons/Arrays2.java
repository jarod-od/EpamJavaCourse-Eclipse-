package com.jarod.epam.lessons;

import java.util.Random;

public class Arrays2 {

	public static void main(String[] args) {
		
		double [] arr = new double[5];
		
		Random rand = new Random();
		
		int temp;
		for (int i = 0; i < arr.length; i++) {
			
			temp = rand.nextInt(100);
			arr[i] = temp + rand.nextDouble();
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.printf("arr[%d] = %.2f ", i, arr[i]);
		}
		
	}
}
