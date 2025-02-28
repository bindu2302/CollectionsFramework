package ArrayDeque;

import java.util.ArrayDeque;

public class Example1 {

	public static void main(String[] args) {
		ArrayDeque queue = new ArrayDeque();
		
		queue.add(10);
		queue.add("kod");
		queue.add(false);
		queue.add(10.12);
		System.out.println(queue);
		
		queue.addLast("last");
		queue.addFirst("first");
		System.out.println(queue);
		
		
		queue.removeFirst();
		queue.removeLast();
		System.out.println(queue);
		
		queue.pollFirst();
		System.out.println(queue);

		queue.pollLast();
		System.out.println(queue);
		
		for(Object o : queue) {
			System.out.println(o);
		}

	}

}
