package com.jarod.epam.lessons;

import java.util.Random;

public class ArraysText {
	
	public static void main(String[] args) {
		
		String[] names = {"Vova", "Vika", "Vanya", "Venya"};
		
		// Обратный перебор
		for (int i = names.length-1; i >= 0; i--) {
			
			System.out.println(names[i]);
		}
		System.out.println(names.length);
		System.out.println(names[2]);
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		////////////////////////////////////////////////////
		
		// Ищем сумму всех элементов массива
		Random rand = new Random();
		
		int[] numbers = new int[5];
		int sum = 0;
		for (int i = 0; i <  numbers.length; i++) {
			
			numbers[i] = rand.nextInt(100);
			System.out.println(numbers[i]);
			System.out.println("--");
			
			sum = sum + numbers[i];
			System.out.println(sum);
		}
		
		System.out.println("sum is: " + sum);
		double average = (double) sum / numbers.length;
		System.out.println("average is: " + average);
	}
}










