package ex;

public class SongTest {

	public static void main(String[] args) {

		Song s1 = new Song("밤편지", "아이유", "밤편지", 2017, 1, "제휘", "김희원");
		
		//Song s1 = new Song("밤편지", "아이유", "밤편지",new String[]{"제휘", "김희원"}, 2017, 1);
		
		s1.show();

	}

}
