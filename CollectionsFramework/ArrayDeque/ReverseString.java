package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		ArrayDeque<Character> stack = new ArrayDeque<>();
		
		for(char ch : input.toCharArray()) {
			stack.push(ch);
		}
		
		StringBuilder reversed = new StringBuilder();
		
		while(!stack.isEmpty()) {
			reversed.append(stack.pop());
		}
		System.out.println(reversed);
	}

}
