package LinkedList;

import java.util.LinkedList;

public class Program1 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println("Linked list: " + list);
		
		list.set(0,99);
		System.out.println("Linked list: " + list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
