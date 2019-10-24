package com.jarod.epam.lessons;

// Конкатенация массивов. Сложение всех элементов массива

public class ArraysConcat {

	public static void main(String[] args) {

		int[] first = { 4, -22, 5, 87, -9, 3, 1 };
		int[] second = { 55, -6, 44, 23 };

		int[] result = new int[first.length + second.length];

		for (int i = 0; i < first.length; i++) {
			result[i] = first[i];
		}

		for (int i = 0; i < second.length; i++) {
			result[i + first.length] = second[i];
		}

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
