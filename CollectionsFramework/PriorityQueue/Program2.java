package PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		PriorityQueue<Integer> task = new PriorityQueue<Integer>();
		for(int i=0; i<n; i++) {
			task.add(sc.nextInt());
		}
		
		int newtask = sc.nextInt();
		task.add(newtask);
		
		task.remove();
		
		Object[] arr = task.toArray();
		Arrays.sort(arr);
		
		System.out.println("Updated list: ");
		for(Object ele : arr) {
			System.out.print(ele + " ");
		}
		
		
	}

}
