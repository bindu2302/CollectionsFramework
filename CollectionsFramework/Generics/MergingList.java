package Generics;
import java.util.*;

public class MergingList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		ArrayList<String> color1 = new ArrayList<>();
		for(int i=0; i<n1; i++) {
			String color = sc.next();
			color1.add(color);
		}
		
		
		int n2 = sc.nextInt();
		ArrayList<String> color2 = new ArrayList<>();
		for(int i=0; i<n2; i++) {
			String color = sc.next();
			color2.add(color);
		}
		
		ArrayList<String> mergedList = new ArrayList<>();
		mergedList.addAll(color1);
		mergedList.addAll(color2);
		
		System.out.print("List of first array: ");
		for(String color: color1) {
			System.out.print(color+ " ");
		}
		System.out.println();
		
		
		System.out.print("List of second array: ");
		for(String color: color2) {
			System.out.print(color+ " ");
		}
		System.out.println();
		
		
		System.out.print("New array: ");
		for(String color: mergedList) {
			System.out.print(color+ " ");
		}
		System.out.println();
	}

}
