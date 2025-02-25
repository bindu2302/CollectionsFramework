package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdatingelementsusingAdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		
		ArrayList<String> list = new ArrayList();
		String[] elements = scan.nextLine().split(" ");
		for(String element: elements) {
			list.add(element);
		}
		
		int index = scan.nextInt();
		scan.nextLine();
		String newele = scan.nextLine();
		
		if(index>=0 && index<=list.size()) {
			list.add(index,newele);
		} else {
			System.out.println("Invalid index");
			return;
		}
		
		System.out.print("Updated result: ");
		for(String item: list) {
			System.out.print(item + " ");
		}
		
		
	}

}
