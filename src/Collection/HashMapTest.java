package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, Integer> m = 
				new HashMap<String, Integer>();
		
		m.put("one", 1); //auto boxing
		m.put("two", 2); 
		m.put("three", 3);
		
		int i = m.get("two"); //auto unboxing
		System.out.println(i);
		
		m.put("three", 33333); //같은 키값으로 값을 추가하면 덮어쓰기 됨
		System.out.println(m.get("three"));
		
		//순회
		Set<String> keys = m.keySet();
		for(String key : keys) {
			System.out.println(m.get(key));
		}
	}
}
