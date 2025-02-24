package ArrayList;

import java.util.ArrayList;

public class iterable {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		
		for(int i=0; i<=list.size()-1; i++) {
			System.out.println((int)(list.get(i)) * 10);
		}

		
	}

}
