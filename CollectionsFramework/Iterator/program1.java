package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class program1 {
    public static void main(String[] args) {
        // Creating a list and adding elements
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Getting an iterator for the list
        Iterator<String> itr = list.iterator();

        // Iterating through the list
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
