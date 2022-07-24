package exam_class_basic;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car(); // 첫 번째 객체 생성

		/*
		 * //각자의 필드에 값 설정 해주는 방법
		 *  myCar.speed=0; //객체의 필드 변경
		 *  myCar.gear =1; 
		 *  myCar.color ="red";
		 */
		
		//객체 두개 중복제거 위한 메소드를 만들었다
		myCar.carData(0, 1, "red");
		
		// 객체의 메소드 호출
		myCar.speedUp(20);

		
//public void printData() { System.out.println("속도: " + speed + " 기어" + gear +"색상 " + color); }
		
		myCar.printData(); // 출력1

//public String toString() {
		//return "속도: " + speed + " 기어" + gear + "색상 " + color; }
		 
		System.out.println(myCar.toString()); // 출력2 return문 이용 출력
		System.out.println();

		Car yourCar = new Car();

		//yourCar.gear = 3;
		//yourCar.speed = 60;
		//yourCar.color = "blue";
		
		yourCar.carData(3, 60, "blue");
		yourCar.speedDown(40);
		yourCar.printData();
		System.out.println(yourCar.toString());

	}

}
