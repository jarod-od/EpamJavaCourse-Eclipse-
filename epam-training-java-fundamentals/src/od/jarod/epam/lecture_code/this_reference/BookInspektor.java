package od.jarod.epam.lecture_code.this_reference;

public class BookInspektor {
	public static void main(String[] args) {

		Book myBook = new Book(); // выделилась память и там есть поле price свое
		Book myBook2 = new Book(); // и здесь своё поле price

		myBook.setPrice(200); // -> setPrice(myBook, 200)
		myBook2.setPrice(100); // -> setPrice(myBook2, 100)

		System.out.println(myBook.getPrice());
		System.out.println(myBook);
	}
}