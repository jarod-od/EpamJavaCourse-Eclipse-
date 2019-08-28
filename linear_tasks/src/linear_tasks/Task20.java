package linear_tasks;

// Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

import java.util.Scanner;

public class Task20 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Square circle is: ");
		
	double circleLengt;
	
		while (true) {
			
			try {
				System.out.println("pls input a variable: ");
				
				Scanner s = new Scanner(System.in);
				circleLengt = s.nextDouble();
				
				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again!");
			}
		}
		
		/*
		 * C=2πR длина окружности
		 * 18,84=2*3,14*R 
		 * R=18.84/6.28 R=3м радиус окружности
		 * S=πR² площадь окружности 
		 * S=3.14*3²=3.14*9=28.26м²=28,3м²
		 */
		
	}
}
