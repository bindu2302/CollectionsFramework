package Maps;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.WeakHashMap;

public class WeakhashMap_identityHashMap_program2 {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 WeakHashMap<Integer, String> sessionTokens = new WeakHashMap<>();
    	 
    	 int n = sc.nextInt();
    	 sc.nextLine();
    	 
    	 for(int i=0; i<n; i++) {
    		 int tokenId = sc.nextInt();
    		 String tokenValue = sc.next();
    		 sessionTokens.put(tokenId, tokenValue);
    		 System.out.println("Added Token: " + tokenId + " -> " + tokenValue);
    	 }
    	 
    	 //check if token exists or not 
    	 System.out.println("Enter a token ID to check:");
    	 int checkTokenId = sc.nextInt();
    	 boolean exists = sessionTokens.containsKey(checkTokenId);
    	 System.out.println("Token " + checkTokenId + " exists: " + exists);
    	 
    	 //print all active session tokens
    	 System.out.println("All Active session Tokens:");
    	 for(Map.Entry<Integer,String> entry : sessionTokens.entrySet()) {
    		 System.out.println(entry.getKey() + " -> " + entry.getValue());
    	 }
    	 
    	 
    	 IdentityHashMap<Integer, String> userIdentityMap = new IdentityHashMap<>();
    	 System.out.println("Enter the number of users:");
    	 int m = sc.nextInt();
    	 sc.nextLine();
    	 
    	 for(int i=0; i<m; i++) {
    		 int userId = sc.nextInt();
    		 String userName = sc.next();
    		 userIdentityMap.put(userId, userName);
    		 System.out.println("Added user: " + userId + " -> " + userName);
    	 }
    	 
    	 System.out.println("Are the two users with the same data identical? " + userIdentityMap.containsKey(1));
    	 
    }
}
