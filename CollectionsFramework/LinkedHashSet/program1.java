package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedHashSet list = new LinkedHashSet();
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println("Linked list: " + list);
		
		int newel= sc.nextInt();
		
		
		if(list.contains(newel)) {
			System.out.println("Exists");
		} else {
			System.out.println("Not Exists");

		}
		
	}
	

}
