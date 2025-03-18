package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMap_program {

	public static void main(String[] args) {
		
		String k1 = new String("key 1");
		String v1 = new String("value 1");
		String k2 = new String("key 2");
		String v2 = new String("value 2");
		
		Map hashMap = new HashMap();
		hashMap.put(k1, v1);
		Map weakMap = new WeakHashMap();
		weakMap.put(k2, v2);
		
		
		System.out.println(hashMap);
		System.out.println(weakMap);
		
		k1 = null;
		k2 = null;
		
		System.gc();
		
		System.out.println(hashMap);
		System.out.println(weakMap);
		
		
		
	}

}
