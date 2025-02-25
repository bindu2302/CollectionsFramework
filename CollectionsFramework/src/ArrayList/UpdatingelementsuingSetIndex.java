package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdatingelementsuingSetIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
        ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(sc.nextInt());
		}
		
		int index = sc.nextInt();
		int newElement = sc.nextInt();
		
		if (index >= 0 && index < list.size()) { // Ensure index is valid
            list.set(index, newElement);
        } else {
            System.out.println("Invalid index");
            return;
        }

        // Print the updated list without brackets
        System.out.println("Updated array: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
	}

}
