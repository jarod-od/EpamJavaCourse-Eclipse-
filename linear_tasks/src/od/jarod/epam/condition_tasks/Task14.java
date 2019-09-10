package od.jarod.epam.condition_tasks;


/*Даны два угла треугольника в градусах. Определить, существует ли такой треугольник,
и если да, то будет ли он прямоугольным
*/

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		double angle1;
		double angle2;
		
		while (true) {
			try {
				System.out.println("Pls, input angle 1 & angle 2");
				
				Scanner s = new Scanner(System.in);
				angle1 = s.nextDouble();
				angle2 = s.nextDouble();
				
				break;
				
			} catch (Exception e) {}
				System.out.println("Input invalid, pls try again!");
		}
		
		
		
		
		
	}
}
