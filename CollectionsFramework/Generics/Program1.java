package Generics;

public class Program1 {

	public static void main(String[] args) {
		
		int a = 10;
		
		// Boxing (converting primitive to non-primitive)
		Integer i = new Integer(a);
		System.out.println(i);
		
		// UnBoxing (converting non primitive to primitive)
		int b = i;
		System.out.println(b);
	}

}
