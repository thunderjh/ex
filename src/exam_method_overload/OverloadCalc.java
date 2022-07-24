package exam_method_overload;

public class OverloadCalc {
	public int plus(int a, int b) {
		System.out.println("plus(int a, int b)"); 
		return a + b;
	}

	public float plus(float a, float b) {
		System.out.println("plus(float a, float b)");
		return a + b;
	}

	public double plus(double a, double b) {
		System.out.println("plus(double a, double b)");
		return a + b;
	}

	public int plus(int... c) {
		System.out.println("plus(int ... c)");
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum += c[i];
		}

		return sum;
	}
	
	 //오류! 같은 매개변수 가변이든 배열이든 둘 중 하나만 사용해야함
	//public int plus(int[] v) { //오류! 같은 매개변수
	
	public int plusInt(int[] v) {
		int sum = 0;
		
		for (int i = 0; i < v.length; i++) {
			sum += v[i];}
		return sum;
		
	}

}
