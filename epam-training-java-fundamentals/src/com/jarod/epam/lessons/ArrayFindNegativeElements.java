package com.jarod.epam.lessons;

// Надо найти отрицательные и положительные числа

public class ArrayFindNegativeElements {

	public static void main(String[] args) {
		
		int[] elements = {4, 55, -2, -9, 43, -77, 1}; //Массив элементов
		
		int countNegative = 0; // Счетчик отрицательных элементов
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] < 0) {
				countNegative++;
			}
		}
		
		int[] pozitiveElements = new int[elements.length - countNegative];// Массив позитивный
		int[] negativeElements = new int[countNegative]; // Массив негативный
		
		int pozitiveIndex = 0; // Внутренняя переменная счетчиков для индексации по массивам
		int negativeIndex = 0;
		
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] < 0) {
				negativeElements[negativeIndex] = elements[i];
				negativeIndex++;
				
			} else {
				pozitiveElements[pozitiveIndex] = elements[i];
				pozitiveIndex++;	
			}	
		}
		for (int i = 0; i < pozitiveElements.length; i++) {
			System.out.print(pozitiveElements[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < negativeElements.length; i++) {
			System.out.print(negativeElements[i] + " ");
		} 
	}
}
