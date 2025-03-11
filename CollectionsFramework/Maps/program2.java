package Maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class program2 {

	public static void main(String[] args) {

		LinkedHashMap<Integer,String> map = new LinkedHashMap();
		map.put(101, "amit");
		map.put(102, "sumit");
		map.put(103, "raj");
		map.put(104, "rakesh");
		map.put(105, "kumi");
		
		System.out.println(map);
		
		//Collection/ Map views
		Set set = map.keySet();
		System.out.println(set);
		
		Collection c = map.values();
		System.out.println(c);
		
		Set s2 = map.entrySet();
		System.out.println(s2);
		
		for(Map.Entry<Integer,String>m: map.entrySet()) {
			System.out.println("Key: " + m.getKey());
			System.out.println("Value: " + m.getValue());

		}
		
	}

}
