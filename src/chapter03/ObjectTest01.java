package chapter03;

public class ObjectTest01 {
	public static void main(String[] args) {
		Point p = new Point(10, 20);

		//reflection
		System.out.println(p.getClass());
		
		//reference value x (레퍼런스 변수에 저장되어 있다)
		//address x
		//address 기반의 hashing값
		System.out.println(p.hashCode());
		
		//getClass() + "@" + hashCode()
		System.out.println(p.toString());
		System.out.println(p);
		
		
	}
}
