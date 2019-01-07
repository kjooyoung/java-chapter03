package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("둘리");
		list.add("마이콜");
		list.add("도우넛");
		
		// 순회 1
		int count = list.size();
		for(int i=0; i<count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		list.remove(1);
		
		// 순회 2
		Iterator<String> it = list.iterator();
		
		//Iterator는 한번 순회하면 다시 생성해야함
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		// 순회 3(for~each)
		for(String s : list) {
			System.out.println(s);
		}
	}
}
