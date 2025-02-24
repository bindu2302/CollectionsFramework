package ArrayList;

import java.util.ArrayList;

public class example1 {
	
	public static void main(String[] args) {
		ArrayList veg = new ArrayList();
		veg.add("potato");
		veg.add("tomato");
		veg.add("ginger");
		veg.add("brinjal");
		System.out.println(veg);
		
		ArrayList fruits = new ArrayList();
		fruits.add("mango");
		fruits.add("guava");
		fruits.add("apple");
		System.out.println(fruits);
		
		ArrayList veg_fruits = new ArrayList();
//		veg_fruits.add(veg);
//		veg_fruits.add(fruits);
//		System.out.println(veg_fruits); // [[potato, tomato, ginger, brinjal] , [mango, guava, apple]]
//		System.out.println(veg_fruits.get(0));
//		System.out.println(veg_fruits.get(1));
//		System.out.println(((ArrayList)veg_fruits.get(1)).get(1));
		
		veg_fruits.addAll(veg);
		veg_fruits.addAll(fruits);
		System.out.println(veg_fruits); //[potato, tomato, ginger, brinjal, mango, guava, apple]
		System.out.println(veg_fruits.get(6)); //apple
		
		veg_fruits.remove(0);
		System.out.println(veg_fruits); //[tomato, ginger, brinjal, mango, guava, apple]
		veg_fruits.removeFirst();
		System.out.println(veg_fruits); //[ginger, brinjal, mango, guava, apple]
		veg_fruits.removeLast();
		System.out.println(veg_fruits); //[ginger, brinjal, mango, guava]
		veg_fruits.removeAll(veg_fruits);
		System.out.println(veg_fruits); //[]






	}

}
