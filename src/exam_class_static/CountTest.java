package exam_class_static;
class Count{
	private static int totalCount;
	private int count;
	
	public Count() {
		totalCount ++;
		count ++;
	}
	
	public void display() {
		System.out.println(count); //count는 서로 공간 독립적 1..1..1
		System.out.println(totalCount); //1..2..3
		System.out.println();
	}
	
}
public class CountTest {

	public static void main(String[] args) {
		Count obj1 = new Count();
		obj1.display();
		Count obj2 = new Count();
		obj2.display();
		Count obj3 = new Count();
		obj3.display();
		
	}

}
