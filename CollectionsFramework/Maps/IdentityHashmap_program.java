package Maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashmap_program {
	public static void main(String[] args) {
		
		String k1 = new String("rahul");
		String v1 = new String("delhi");
		String k2 = new String("rahul");
		String v2 = new String("bangalore");
		
		Map hashMap = new HashMap();
		hashMap.put(k1, v1);
		hashMap.put(k2, v2);
		
		System.out.println(hashMap);

		
		Map idMap = new IdentityHashMap();
		idMap.put(k1, v1);
		idMap.put(k2, v2);
		
		System.out.println(idMap);
	}		
}
