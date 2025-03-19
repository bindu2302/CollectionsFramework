import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModification {
    public static void main(String[] args) {
    	
    	CopyOnWriteArrayList li = new CopyOnWriteArrayList();
    	li.add(10);
    	li.add(20);
    	li.add(30);
    	li.add(40);
        System.out.println("Before concurrent modifications: " + li);
        
        
//        Iterator itr = li.iterator();
//        while(itr.hasNext()) {
//        	System.out.println(itr.next());  //ConcurrentModificationException
//        	li.add(99);
//        }
        
        System.out.println("after concurrent modifications: " + li);


        
//        for (int i = 0; i < li.size(); i++) {
//        	System.out.println(li.get(i));
//            li.add(99); 
//
//        }
        
        
//        // fail-fast
//        for(Object o : li) {   //ConcurrentModificationException
//        	//access list
//        	System.out.println(o);
//        	// modify list
//        	li.add(99); 
//        }
        
        
    }
}
