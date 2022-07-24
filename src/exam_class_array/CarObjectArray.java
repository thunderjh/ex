package exam_class_array;

class Car {
	private int speed;
	private int gear;
	private String color;

	public Car() {
		speed = 80;
		gear = 1;
		color = "red";

	}

	public void speedUp() {
		speed += 10;
	}

	public String toString() {
		return "속도: " + speed + " 기어: " + gear + " 색상: " + color;
	}
}

public class CarObjectArray {

	public static void main(String[] args) {
		//자동차 5대를 만들 것
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS]; //객체배열선언

		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car(); //객체생성
		}
		for (int i = 0; i < cars.length; i++) {
			cars[i].speedUp();
		}
		for (int i = 0; i < cars.length; i++) {
			System.out.println("자동차(" + (i + 1) + ")" + cars[i].toString());

		}

	}

}
