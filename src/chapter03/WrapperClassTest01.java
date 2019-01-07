package chapter03;

public class WrapperClassTest01 {
	
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('A');
		Boolean b = new Boolean(true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);
		
		// Auto Boxing
		Integer i2 = 10;
		Integer i3 = 10;
		System.out.println(i2 == i3);
		
		// Auto Unboxing
//		int j = 20 + i2.intValue();
		int j = 20 + i2;
	}
}
