package exam_class_basic;

import java.util.Scanner;

public class MovieTest {
	public static Scanner input = new Scanner(System.in); // !!

	public static void main(String[] args) {
	
		Movie myMovie3 = new Movie();
		inputData(myMovie3); } //{} 범위 설정 주의
		
		public static void inputData(Movie mv){
			
		System.out.print("영화 제목을 입력하시오");
		mv.title = input.nextLine();
		System.out.print("영화 배우을 입력하시오");
		mv.actor = input.nextLine();
		System.out.print("영화관을 입력하시오");
		mv.theater = input.nextLine();
		System.out.print("영화가격을 입력하시오");
		mv.price = input.nextLine();		
		
		
		
		input.close();
		
		mv.printData(); }

	}


