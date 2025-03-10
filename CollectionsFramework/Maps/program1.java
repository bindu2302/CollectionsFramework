package Maps;

import java.util.Set;
import java.util.TreeMap;

public class program1 {

	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		
		t.put(77, "amit");
		t.put(33, "sumit");
		t.put(2, "raj");
		t.put(5, "rakesh");
		t.put(4, 10);
		System.out.println(t);
		
		boolean s = t.containsKey(2);
		System.out.println(s);
		
		boolean s1 = t.containsValue("rah");
		System.out.println(s1);
		
		
		Set s2 = t.entrySet();
		System.out.println(s2);
		
		
		t.clear();
		System.out.println(t);


		
	}

}
