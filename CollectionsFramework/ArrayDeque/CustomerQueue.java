package ArrayDeque;

import java.util.*;

public class CustomerQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read the number of initial customers (n)
        int n = sc.nextInt();

        // TODO: Create an ArrayDeque to store customer IDs
        ArrayDeque<Integer> ids = new ArrayDeque<>();

        // TODO: Read and add n customer IDs to the ArrayDeque
        for (int i = 0; i < n; i++) {
            ids.add(sc.nextInt());
        }

        // TODO: Read the customer ID to insert at the front
        int id1 = sc.nextInt();
        ids.addFirst(id1);

        // TODO: Read the customer ID to insert at the end
        int id2 = sc.nextInt();
        ids.addLast(id2);

        // TODO: Remove the first customer from the queue
        ids.pollFirst();

        // TODO: Print the updated queue of customer IDs
        System.out.println("Updated Queue of Customer IDs:");
        for (int id : ids) {
            System.out.print(id + " ");
        }

        sc.close();
    }
}
