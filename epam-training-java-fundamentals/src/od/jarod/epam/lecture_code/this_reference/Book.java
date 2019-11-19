package od.jarod.epam.lecture_code.this_reference;

// Байткод класса Book, грузится в память один раз
// После загрузки класса все его методы хранятся в единственном экземпляре

public class Book {
	private int price; // поле экземпляра класса
	
	public int getPrice() { // getPrice(Book this)
		method(); 	   // this.method
		return price; // this.price
	}
	
	public void setPrice(int price) { // локальное поле метода пересекается с именем экземпляра
		this.price = price; // для того что бы явно обратиться к полю экземпляра требуется указать this
// если прописать без this то мы присвоим значение переменной метода
		/*
		 * При вызове метода setPrice(), в параметры метода вместо неявной ссылки
		 * Book this, передастся адрес объекта myBook и мы обратимся к полю price
		 * на объекте myBook - setPrice(myBook, 200);
		 */
	}
	
	/* public void setPrice(Book this, int price){
	 * 		this.price = price;
	 * }
	 */
	
	private void method() {	
		
	}
}
