package od.jarod.epam.condition_tasks;

/*
*  21.Программа - льстец. На экране высвечивается вопрос "Кто ты: мальчик или девочка? 
*  Введи Д или М".В зависимости от ответа на экране должен появиться текст -
* "Мне нравятся девочки!" или "Мне нравятся мальчики!"
*/

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		
		System.out.println("Кто ты: мальчик или девочка?");

		char s = 'М';
		String s2 = "Ж";
		
		while (true) {
			
			try {
				System.out.println(" Input 'М' or 'Д'");
				
				Scanner sc = new Scanner(System.in);
				//s = sc.next();
				s2 = sc.nextLine();
				
				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input");
			}
		}
		
		if (s != 'М' ) {
			
		}
		
		
	}
}
