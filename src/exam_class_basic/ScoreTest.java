package exam_class_basic;

import java.util.Scanner;

public class ScoreTest {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Score[] sc = new Score[3];
		for (int i = 0; i < sc.length; i++) {
			sc[i] = new Score();
			inputScore(sc[i]);
			sc[i].getTotal();
		}
		System.out.println("=====================================================");
		String[] subject = { "이름", "국어", "영어", "수학", "총점", "평균", "학점" };
		for (int i = 0; i < subject.length; i++) {
			System.out.printf("%s\t", subject[i]);
		}

		System.out.println("\n=====================================================");
		for (int i = 0; i < sc.length; i++) {
			System.out.println(sc[i].toString());
		}

	};

	public static void inputScore(Score s) {
		System.out.print("이름을 입력");

		s.setName(input.nextLine());

		System.out.print("국어 점수를 입력");
		s.setKor(input.nextInt());

		System.out.print("영어 점수를 입력");
		s.setEng(input.nextInt());
		input.nextLine();
		System.out.print("수학 점수를입력");
		s.setMat(input.nextInt());
		input.nextLine();

		
	}

}
