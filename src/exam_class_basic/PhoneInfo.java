package exam_class_basic;
//“프로그램 사용자로부터의 데이터 입력” 즉, 프로그램 사용자로부터 데이터를 입력 받아서 PhoneInfo클래스의 인스턴스를 생성한다. 
//프로그램 사용자가 종료 명령을 할 때까지 반복문을 사용하여 반복한다.
//키보드로부터 데이터 입력
//↓
//입력 받은 데이터로 PhoneInfo의 인스턴스 생성
//↓
//생성된 인스턴스의 showPhoneInfo 메소드 호출

//그리고 실행 때마다 생성된 인스턴스는 유지되지 않아도 된다. 프로그램의 흐름을 계속할
//아니면 종료할지 프로그램 사용자가 선택할 수 있도록 해야 한다. 단 현재 예제에서는 사용자에게 이름, 전화번호, 생년월일을 입력 받도록 하자.

//선택하세요
//1. 데이터 입력
//2. 프로그램 종료
//선택 : 1
//이름 : 홍길동
//전화번호 : 123-1234
//생년월일 : 2000년 11월 22일

//입력된 정보 출력…
//name : 홍길동
//phone : 123-1234
//birth : 2000년 11월 22일

//선택하세요
//1. 데이터 입력
//2. 프로그램 종료
//선택 : 2
//프로그램을 종료합니다.

public class PhoneInfo {
	private String name; 
	
	

	private String phoneNum;
	private String birthDay;
	
	public PhoneInfo() {}
	public PhoneInfo(String name, String phoneNum, String birthDay) {
		//super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.birthDay = birthDay;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
	public void show() {
		System.out.println("입력된 정보 출력…");
		System.out.println("name : " + name );
		System.out.println("phone : " +  phoneNum);
		System.out.println("birth : " + birthDay);
		
	}
	

}
