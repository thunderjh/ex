package exam_method_overload;

public class OverloadCalcTest {

	public static void main(String[] args) {
		OverloadCalc over = new OverloadCalc();
		
		int i  = over.plus(3,5);
		System.out.println(i);
		float j = over.plus(1.5f, 3.2f);
		System.out.println(j);
		double k = over.plus(2.4, 4.5);
		System.out.println(k);
		
		int num = over.plus(5,3,8,9,2); //가변배열 마음대로 설정
		System.out.println(num);
		
		//첫번쨰 배열 초기화하기
		int[] values1 = {1,2,3}; 
		int result = over.plusInt(values1);
		System.out.println(result);
		//두번째
		int result2 = over.plusInt(new int [] {1,2,3,4,5});
		System.out.println(result2);
		
		

	}

}
