package com.jarod.epam.lessons;

public class ArraysText {
	
	public static void main(String[] args) {
		
		String[] names = {"Vova", "Vika", "Vanya", "Venya"};
		
		// Обратный перебор
		for (int i = names.length-1; i >= 0; i--) {
			
			System.out.println(names[i]);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		System.out.println(names.length);
		System.out.println(names[2]);
	}
}
