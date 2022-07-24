package exam_class_basic;

import java.util.Scanner;

/*if (birthday.equals(""))   // 혹 사용자가 생년월일을 입력하지 않고 엔터를 입력하였다면 ""(빈문자)로 대입
	birthday = null;       // showPhoneInfo() 메서드에서는 생년월일에 대한 제어를 null로 명시.
 */
public class PhoneInfoTest {
	public static Scanner input = new Scanner(System.in);
	public static int x;

	public static void main(String[] args) {
		PhoneInfo s1 = new PhoneInfo();

		while (true) {
			System.out.println("선택하세요");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 프로그램 종료");
			System.out.print("선택 : ");
			x = input.nextInt();

			if (x == 1) {
				input.nextLine();//!!
				System.out.print("이름 : ");
				s1.setName(input.nextLine());

				System.out.print("전화번호 : ");
				s1.setPhoneNum(input.nextLine());

				System.out.print("생일 : ");
				s1.setBirthDay(input.nextLine());
				System.out.println();
				s1.show();
				System.out.println();
			} else {
				System.out.println("프로그램을 종료합니다.");
				input.close();
				break;
			}

		}
	}

}
