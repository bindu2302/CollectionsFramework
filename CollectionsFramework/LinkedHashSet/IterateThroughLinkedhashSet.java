package LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class IterateThroughLinkedhashSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		LinkedHashSet<String> attendee = new LinkedHashSet<>();
		for(int i=0; i<n; i++) {
			String names = sc.nextLine();
			attendee.add(names);
		}
		
		System.out.println("iterate through for-each loop");
		for(String name: attendee) {
			System.out.println(name);
		}
		
		System.out.println("iterate through iterator");
		Iterator<String> iterator = attendee.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
