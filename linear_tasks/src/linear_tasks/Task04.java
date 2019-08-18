package linear_tasks;

// Найдите значение функции: z = ((a - 3) * b / 2) + c.

import java.util.Scanner;

public class Task04 {

 	public static void main(String[] args) {
 		int a;
 		int b;
 		int c;
 		
 		while (true) 
 			try {
 				System.out.println("Pls input a, b, c: ");
 				
 				Scanner s = new Scanner(System.in);
 				a = s.nextInt();
 				b = s.nextInt();
 				c = s.nextInt();
 				
 				System.out.println("z = " + ( (a - 3) * b / 2 + c) );
 				break;
 		} catch (Exception e) {
 			System.out.println("Invalid input, pls try again !");
 		}
 		
 	}
}
