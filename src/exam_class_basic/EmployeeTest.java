package exam_class_basic;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee myEmployee = new Employee();
		
		myEmployee.employData("홍길동","010-2345-3476",1000000);
		myEmployee.printData();
		
		Employee myEmployee2 = new Employee();
		
		myEmployee2.employData("김철수","010-2342-5242",7000000);
		myEmployee2.printData();
		
		

	}

}
