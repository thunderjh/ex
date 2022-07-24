package exam_matator_accessor;

public class CarMutatorrAccessorTest {

	public static void main(String[] args) {
		CarMutatorrAccessor myCar = new CarMutatorrAccessor();
		
		//설정자 메소드 호출
		myCar.setSpeed(-70);
		myCar.setColor("red");
		myCar.setGear(1);
		
		//접근자 메소드 호출
		System.out.println("=== 접근자 메서드 호출로 필드 출력===");
		System.out.println("현재 자동차 색상 : " + myCar.getColor());
		System.out.println("현재 자동차 속도 : " + myCar.getSpeed());
		System.out.println("현재 자동차 기어 : " + myCar.getGear());
		
		System.out.println("=== toString() 메서드로 전체 필드 출력===");
		System.out.println(myCar.toString());
		

	}

}
