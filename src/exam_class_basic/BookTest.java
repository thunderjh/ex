package exam_class_basic;

public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.bookData("1","그릿","다크",6000);
		b1.display();
		System.out.println();
		System.out.println(b1.toString());
		System.out.println();
		Book b2 = new Book();
		b2.bookData("2", "자바","화이트", 7000);
		b2.display();
		System.out.println();
		System.out.println(b2.toString());
		System.out.println();

} }
