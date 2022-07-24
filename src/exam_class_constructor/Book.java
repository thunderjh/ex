package exam_class_constructor;

public class Book {
	String title;
	String author;
	public Book() {
		this("", "");
	}
	
	public Book(String title) {
		this(title, "작가미상"); //다른 생성자 호출할 때
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		
	}
	
	public String toString() {
		return "책제목 : " +title + " 책저자 : " + author;
	}
	
}
