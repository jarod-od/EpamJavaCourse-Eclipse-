package linear_tasks;

// Заданы координаты трех вершин треугольника (x1 y1),(x2 y2),(x3 y3). Найти его периметр и площадь

import java.util.Scanner;

public class Task13 {
	public static void main(String[] args) {
		System.out.println("Perimetr is: AB + BC + AC");
		System.out.println("Square is: 1/2 (((x1-x3) * (y2-y3)) - ((y1-y3) * (x2-x3)))");

		double[] dot = new double[6];

		while (true) {
			try {
				System.out.println("Pls input: x1, x2, x3, y1, y2, y3");

				Scanner s = new Scanner(System.in);
				for (int i = 0; i < 6; i++) {
					dot[i] = s.nextDouble();
				}
				System.out.println(""); // TODO

				break;
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again!");
			}
		}

	}
}
