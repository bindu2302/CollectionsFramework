package Generics;

public class GenericsExample {

	public static void main(String[] args) {
		MyPrinter<Integer> ip = new MyPrinter();
		ip.printData(99);
		
		MyPrinter<String> sp = new MyPrinter();
		sp.printData("hima");

		MyPrinter<Double> dp = new MyPrinter();
		dp.printData(9.87);

	}
}

class MyPrinter<T> {
	public void printData(T val) {
		System.out.println(val);
	}
}
