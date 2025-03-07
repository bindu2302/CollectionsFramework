package SetInterface;

import java.util.LinkedHashSet;

public class Program2 {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(20);
		set.add(20);
		set.add(7.5);
		set.add("deep");
		set.add("deep");
		set.add(false);
		set.add('g');
		System.out.println(set);
	}

}
