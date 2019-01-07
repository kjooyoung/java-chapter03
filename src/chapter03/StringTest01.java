package chapter03;

public class StringTest01 {
	
	public static void main(String[] args) {
		// c:\temp
		// /temp(unix) <-> d:\temp(window)
		String s1 = "c:\\temp";
		// "Hello"
		String s2 = "\"Hello\"";
		
		System.out.println(s1);
		System.out.println(s2);
		
		// \t -> tab
		// \n -> new line
		// \r -> carriage return
		System.out.print("Hello\tWorld\n");
		System.out.print("Hello\tWorld");
		
		// ''
		char c = '\'';
		System.out.println(c);
	}
}
