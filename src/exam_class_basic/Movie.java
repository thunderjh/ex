package exam_class_basic;

public class Movie {
	public String title;
	public String actor;
	public String theater;
	public String price;

	public void movieData(String title, String actor, String theater, String price) {
		this.title = title;
		this.actor = actor;
		this.theater = theater;
		this.price = price;
	}

	public void printData() {

		System.out.println("제목: " + title + " 배우: " + actor + " 영화관: " + theater + " 가격: " + price);
	}

}
