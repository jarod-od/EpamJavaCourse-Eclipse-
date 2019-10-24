package com.jarod.epam.lessons;

public class ArrayFindMinimum {

	public static void main(String[] args) {

//		Ищем минимальный элемент массива

		int[] numbers = { 5, 34, 2, 89, 68 };

		int min = numbers[0];
		
//		int min1 = (int) Double.POSITIVE_INFINITY; // Если нужен максимум, то minus infinity
// 		Если с Инфинити, то счетчик с нуля начинается
		
		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println(min);
	}
}
