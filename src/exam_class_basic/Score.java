package exam_class_basic;

public class Score {
/*성적을 구하는 클래스
	이름 / 국어 / 영어 / 수학 / 총점 저장하고자 한다(필드구현)
	필드에 값을 설정할 수 있는기능, 점수들의 합을 구하는 기능, 평균을 구하는 기능, 학점을 구하는 기능,
	모든 필드를 출력할 수 있는 기능을 포함하도록한다(메소드구현)
	
	출력결과
	사용자로 하여금 이름 및 점수들을 입력받아 아래의 결과를 출력하도록
	==============
	이름 국어 영어 수학
	==============
	홍길동 90 75 61
	김철수 55 56 46
	이진희 90 90 90*/
	
	
	//이름 / 국어 / 영어 / 수학 / 총점
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMat() {
		return mat;
	}


	public void setMat(int mat) {
		this.mat = mat;
	}


	public void getTotal() {
		total = kor + eng + mat;
	}
	
	
	public Score() {};
	public Score(String name, int kor, int eng, int mat, int total) {
		//super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.total = total;
	}
	
	public Score(String name, int kor, int eng, int mat) {
		this(name ,kor ,eng ,mat , 0);
	}
	
	
	
	public double avg() {
		return (double)total / 3;
		
	}
	public char grade() {
		char grade;
		if(avg()>90)
			grade ='A';
		else if(avg()>80)
			grade = 'B';
		else if(avg()>70)
			grade = 'C';
		else if(avg()>60)
			grade = 'D';
		else
			grade ='F';
		
		return grade;
	}
	

	
	public String toString(){
		
		return String.format("%s\t%d\t%d\t%d\t%d\t%.1f\t%c", name , kor, eng, mat ,total, avg(), grade());
	}

}
