package Maps;

import java.util.*;

public class WeakhashMap_identityHashMap_program2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        Map<Integer, String> identityMap = new HashMap<>();

        System.out.print("Enter the number of tokens: ");
        int tokenCount = sc.nextInt();
        sc.nextLine(); // Consume newline

        for (int i = 0; i < tokenCount; i++) {
            int tokenID = sc.nextInt();
            String tokenName = sc.next();
            identityMap.put(tokenID, tokenName);
            System.out.println("Added token: " + tokenID + " -> " + tokenName);
        }

        System.out.print("Enter a token ID to check: ");
        int checkID = sc.nextInt();
        System.out.println("Token " + checkID + " exists: " + identityMap.containsKey(checkID));

        System.out.println("All Active Session Tokens:");
        for (Map.Entry<Integer, String> entry : identityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // ✅ Fixed: Only ask for user count once
        int userCount;
        while (true) {
            System.out.print("Enter the number of users: ");
            if (sc.hasNextInt()) {
                userCount = sc.nextInt();
                sc.nextLine(); // Consume newline
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                sc.next(); // Discard invalid input
            }
        }

        // ✅ Store only last two users for comparison
        int lastID1 = -1, lastID2 = -1;
        String lastUser1 = "", lastUser2 = "";

        for (int i = 0; i < userCount; i++) {
            int userID = sc.nextInt();
            String userName = sc.next();
            identityMap.put(userID, userName);
            System.out.println("Added user: " + userID + " -> " + userName);

            // ✅ Store last two users for comparison
            if (i == userCount - 2) {
                lastID1 = userID;
                lastUser1 = userName;
            }
            if (i == userCount - 1) {
                lastID2 = userID;
                lastUser2 = userName;
            }
        }

        // ✅ Print only the final comparison result
        boolean areIdentical = lastUser1.equals(lastUser2);
        System.out.println("Are the two users with the same data identical? " + areIdentical);

        sc.close(); // Close scanner
    }
}