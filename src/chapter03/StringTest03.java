package chapter03;

public class StringTest03 {
	
	public static void main(String[] args) {
		String s = "aBcABCabcAbc";
		
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("abc", 7));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,5));
		
		String s2 = "     ab cd     ";
		String s3 = "efg,hij,lmno,pq";
		
		String s4 = s2.concat(s3);
		System.out.println(s4);
		System.out.println("----"+s4.trim()+"----");
		System.out.println("----"+s4.replaceAll(" ", "")+"----");
		
		String[] tokens = s3.split(",");
		for(String str : tokens) {
			System.out.println(str);
		}
		
		// StringBuffer
		StringBuffer sb = new StringBuffer("");
		sb.append("Hello ");
		sb.append("world ");
		sb.append(2019);
		
		// String str = "Hello " + "World " + 2018;
		String str = new StringBuffer("Hello ").
				append("World ").
				append(2018).
				toString();
		
		
		// 주의 : + 연산자로 문자열을 더할 때
		String str2 = "";
		StringBuffer sb2 = new StringBuffer("");
		for(int i=0; i<1000000; i++) {
			// +를 사용할 경우 객체를 생성하기때문에
			// 많이 사용하면 메모리 문제
			//str2 = str2 + i;
			//String str2 = new STringBuffer(str2).append(i);
			
			//밖에서 객체를 만들어놓고 메소드로만 append 하기때문에
			//훨씬 빠름
			sb2.append(i);
		}
		
		//format
		String name = "둘리";
		int score = 100;
		
		System.out.println(name+"님의 점수는 "+score+"점 입니다.");
		String str3 = String.format("%s님의 점수는 %d점 입니다.", name, score);
		System.out.println(str3);
	}
}
