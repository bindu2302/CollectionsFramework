package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<>();
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			String name = sc.next();
			map.put(id, name);
			System.out.println("Added: ID " + id + " -> " + name);
		}
		
		int empId = sc.nextInt();
		if(map.containsKey(empId)) {
			System.out.println("Employee Name: " + map.get(empId));
		} else {
			System.out.println("Employee not found");
		}
		
		int remId = sc.nextInt();
		if(map.containsKey(remId)) {
			System.out.println("Employee removed: " + map.get(remId));
			map.remove(remId);
		} else {
			System.out.println("Employee not found.");
		}
		
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println("ID: " + entry.getKey() + "Name: "+ entry.getValue());
			
		}
	}

}
