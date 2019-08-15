package com.jarod.epam.lessons;

//Составить программу сравнения двух чисел 1 и 2
//если 1 меньше 2 - вывести на экран слово 
// yes, в противном случае - no

public class EasyTasks {
	
	public static void main(String[] args) {
		
		int a = 234;
		int b = 98;
		
		// 1 
		boolean bool;
		bool = a < b; // true
		
		if (bool) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		System.out.println("`````````````");
		
		// 2 
		if (a < b) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		System.out.println("`````````````");

		// 3
		String answer;
		 answer = (a < b) ? "yes" : "no"; 
			 System.out.println(answer);
	}
}
