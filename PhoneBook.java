package Hackerrank.ThirtyDaysofCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Map<String, Integer> contactList = new HashMap<String,Integer>();
        for(int i = 0; i < t; i++) {
            String name = scanner.next();
            int contactNum = scanner.nextInt();
            contactList.put(name, contactNum);
        }
        while(scanner.hasNext()) {
            String query = scanner.next();
            if(contactList.containsKey(query)) {
                System.out.println(query+ "=" + contactList.get(query));
            }
            else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}