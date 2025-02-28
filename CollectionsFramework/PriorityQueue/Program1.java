package PriorityQueue;

import java.util.PriorityQueue;


public class Program1{

	public static void main(String[] args) {
		   // PriorityQueue for Integers
        PriorityQueue<Integer> q1 = new PriorityQueue<>();
        q1.add(30);
        q1.add(40);
        q1.add(50);
        q1.add(5);
        System.out.println("Integer PriorityQueue: " + q1);

        // PriorityQueue for Strings
        PriorityQueue<String> q2 = new PriorityQueue<>();
        q2.add("anu");
        q2.add("abhi");
        q2.add("sam");
        q2.add("zepto");
        q2.add("kiara");
        q2.add("aa");
        
        System.out.println("String PriorityQueue: " + q2);
	}
}


//// output
////Integer PriorityQueue: [5, 30, 50, 40]
////String PriorityQueue: [aa, abhi, sam, zepto, kiara, anu]



