package exam_class_constructor;

public class BookText {

	public static void main(String[] args) {
		Book c1 = new Book();
		Book c2 = new Book("춘향전");
		Book c3 = new Book("춘향전","생텍쥐페리");
		
		System.out.println(c1.title + c1.author);
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		

	}

}
