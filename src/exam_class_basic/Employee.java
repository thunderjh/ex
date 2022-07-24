package exam_class_basic;

public class Employee {
//직원이름 name 전화 번호 phoneNumber 급여 salary 를 필드로 가진다
//직원 정보를 실행 클래스에서 임의의 값으로 설정하여 준다.
//화면에 전체 필드의 내용이 출력되도록 작성
	//직원정보[ 사원명: 홍길동, 전화번호 = 010-2345-3476, 급여 = 1000000 ]
	//직원정보[ 사원명: 김철수, 전화번호 = 010-2342-5242, 급여 = 7000000 ]
	
	public String name;
	public String phoneNumber;
	public int salary;
	
	public void employData(String name, String phoneNumber, int salary) {
		this.name =	name;
		this.phoneNumber= phoneNumber;
		this.salary= salary;
		
	}
	
	public void printData() {
		System.out.println("직원정보[ 사원명: " + name + ", 전화번호 = " + phoneNumber + ", 급여 = " + salary +" ]" );
	}
	
	
}
