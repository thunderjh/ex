package ex;

public class FruitTest {
	static int total;
	static double discountPrice;

	public static void main(String[] args) {
		Fruit[] f1 = new Fruit[] { new Fruit("banana", 4800), new Fruit("strawberry", 21000),
				new Fruit("persimmon", 19000), new Fruit("cherry", 12000) };
		
		System.out.println("=========ㄴㄴ====어려웡ㅋㅋㅋㅋ 테스트 과일구입 목록 ==========");
		System.out.println("============= 과일구입 목록 ==========");
		System.out.println("============= 과일구입 목록 ==========");
		System.out.println("============= 과일구입 목록 ==========");
		
		for (int i = 0; i < f1.length; i++) {
			f1[i].show2();
		}
		
		System.out.println("---------------------------------");
		
		for (int i = 0; i < f1.length; i++) {
			total += f1[i].getPrice();
			discountPrice = total - (total * 0.15);
		}
		
		System.out.println("총금액 : " + total +"원");
		System.out.println("할인후 결제 금액 : " + discountPrice +"원");

	}

}
