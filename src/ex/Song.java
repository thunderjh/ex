package ex;

//노래를 나타내는 Song이라는 클래스를 생성하고자 한다. Song 클래스는 다음과 같은 필드를 갖는다. 
//- 노래의 제목을 나타내는 title
//가수를 나타내는 artist //노래가 속한 앨범 제목을 나타내는 album
//- 노래의 작곡자를 나타내는 composer, 작곡자는 여러 명 있을 수 있다. 
//- 노래가 발표된 연도를 나타내는 year
//- 노래가 속한 앨범에서의 트랙 번호를 나타내는 track
//생성자는 기본 생성자와 모든 필드를 초기화하는 생성자를 작성하고, 노래의 정보를 화면에 출력하는 
//show() 메서드도 작성하라. 각자 원하는 노래로 Song 객체를 생성하고 show()를 이용하여 노래의 정보를 출력하는 프로그램을 작성하라. 
//[출력 결과]
//노래 제목:Dansing Queen
//가수:ABBA
//앨범:Arrival
//작곡가:Benny Andersson,Bjorn Ulvaeus
//년도:1977
//트랙 번호:2
public class Song {
	private String title;
	private String artist;
	private String album;
	private String[] composer; //작곡가는 여러명일 수 있다
	private int year;
	private int track;

	public Song() {
	}
	
	//composer은 가변배열로
	public Song(String title, String artist, String album, int year, int track, String... composer) {

		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	/*public Song(String title, String artist, String album, String[] composer, int year, int track, ) {
	
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}*/

	public void show() {
		System.out.println("노래 제목: " + title);
		System.out.println("가수 : " + artist);
		System.out.println("앨범 : " + album);
		System.out.print("작곡가 : ");
		//배열 출력
		for (int i = 0; i < composer.length; i++) {
			System.out.print(composer[i]);

			if (i != composer.length - 1) {

				System.out.print(",");
			}
		}
		System.out.println();
		System.out.println("년도 : " + year);
		System.out.println("트랙 번호: " + track);

	}

}
