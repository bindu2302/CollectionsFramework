package Generics;

public class GenericExample2 {

	public static void main(String[] args) {
		printValue("Himabindu");
		printValue(123);
		printValue(89.0);
		printValue(true);
	}

//	public static void printValue(Object val) {
//		System.out.println(val);
//	}
	public static <T> void printValue(T val) {
		System.out.println(val);
	}
}

