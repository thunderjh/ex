package exam_matator_accessor;

public class CarMutatorrAccessor {
	// 필드 정의
	private int speed;
	private int gear;
	private String color;

	// 접근자 : private으로 선언된 필드의 값을 반환하는 메서드
	// public 자료형 get필드명() {return 필드명;}
	public int getSpeed() {
		return speed;
	}

	// 설정자 : private으로 선언된 필드의 값을 설정하는 메서드
	// public void set필드명() {필드명=변수명;}
	public void setSpeed(int s) {
		if (s < 0)
			speed = s;
		else
			speed = 0;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int g) {
		gear = g;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		color = c;

	}

	// 메소드 정의
	public void speedUp(int s) { // 속도 증가 메소드 s : 매개변수
		speed += s;
	}

	public void speedDown(int s) { // 속도 감소 메소드
		speed -= s;
	}

	public void printData() {

		// 객체의 상태를 문자열로 출력
		System.out.println("속도: " + speed + " 기어: " + gear + " 색상: " + color);
	}

	public String toString() {

		return "속도: " + speed + " 기어: " + gear + " 색상: " + color;
	}

}
