package exam_class_static;

public class staticMethodTest {
	private static int num1 = 5; //정적 필드. 클래스 필드 선언
	private int num2 =3; //인스턴스 필드

	public static void main(String[] args) {
		staticMethodTest.print1(); //클래스명.정적메소드()
		print1(); //같은 클래스 내에 있어 생략 가능
		
		//staticMethodTest.print2(); //인스턴스 메서드 호출 불가  
		//print2(); 인스턴스 메서드 호출 불가
		
	}
	
	public static void print1() {
		int num3 = num1;
		//int num4 = this.num2; //인스턴스 변수 호출 불가
		System.out.println(num3);
		System.out.println("print1() 호출");
	}
	
	public void print2() {
		int num3 = num1;
		int num4 = num2;
		System.out.println(num3 + "," + num4);
		System.out.println("print2()호출"); //객체생성 없이 호출 불가
	}

}
