package SimpleInfo;
import java.util.Scanner;

import exam_class_basic.PhoneInfo;

public class phoneBookVer2 {
	static Scanner keyboard = new Scanner(System.in);
	
	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 프로그램 종료");
		System.out.print("선택 : ");
	}
	
	public static void readData() {
		System.out.print("이름 : ");
		String name = keyboard.nextLine();
		
		System.out.print("전화번호 : ");
		String phone = keyboard.nextLine();;

		System.out.print("생일 : ");
		String birthday = keyboard.nextLine();
		
		if(birthday.equals(""))//사용자가 생년월일을 입력하지 않고 엔터를 입력하면 ""(빈문자)로 대입
				birthday = null; //메서드에서는 생년월일에 대한 제어를 null로 명시
		
		PhoneInfo info =new PhoneInfo(name, phone, birthday);
		//System.out.println("\n입력된 정보 출력...");
		info.show();
	}
	
	public static void main(String[] args) {
		int choice;
		
		while(true) {
			showMenu();
			choice = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(choice) {
			case 1 :
				readData();
				break;
			case 2 :
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			
		}

	}

}
