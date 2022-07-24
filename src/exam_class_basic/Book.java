package exam_class_basic;

public class Book {

		public String bookNumber;
		public String bookName;
		public String bookPublisher;
		public int bookPrice;
		
		public void bookData(String number, String name, String publisher, int pirce) {
			bookNumber = number;
			bookName =name;
			bookPublisher =publisher;
			bookPrice =pirce; }
		
		public void display() {
			System.out.println("책번호 " + bookNumber + "\n책이름: " +bookName+"\n출판사명: " +bookPublisher+"\n책가격: "+ bookPrice);
		}
		
		public String toString() {
			return String.format("책번호: %s\n책이름: %s\n출판사명: %s\n책가격: %d\n", bookNumber,bookName,bookPublisher,bookPrice);
		}
}
