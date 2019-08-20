package linear_tasks;

// (b + (корень из - b во второй степени + 4 умножить на а и с) делить на 2 * а) 
// минус а в третьей степени умножить на с + b  в минус второй степени
// Все переменные принимают действительные значения.

import java.util.Scanner;

public class Task08 {
	
//	TODO 
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		char ch = '\u221A';
		
		System.out.println("b + " + ch + "b * b + (4ac) / 2a - a^3 * c + b^-2");
		
		while (true)
			try{
			System.out.println("Pls input a, b, c: ");
			
			Scanner s = new Scanner(System.in);
			a = s.nextDouble();
			b = s.nextDouble();
			c = s.nextDouble();
			
			break;
			
		} catch (Exception e) {
			System.out.println("Invalid input, pls try again");
		}
		
		double firstPart;
		
		
	}
}
