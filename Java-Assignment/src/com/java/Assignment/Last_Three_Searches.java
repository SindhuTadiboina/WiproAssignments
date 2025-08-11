package com.java.Assignment;
import java.util.*;
public class Last_Three_Searches {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        ArrayDeque<String> searchHistory = new ArrayDeque<>();

        while (true) {
            System.out.print("Enter search terms: ");
            String term = scan.nextLine();

            if (term.equalsIgnoreCase("exit")) {
                break;
            }
            if (searchHistory.size() == 3) {
                searchHistory.removeFirst();
            }

            searchHistory.addLast(term);

            System.out.println("Current search history:");
            for (String s : searchHistory) {
                System.out.println(s);
            }
            System.out.println();
        }

        System.out.println("Final search history:");
        for (String s : searchHistory) {
            System.out.println(s);
        }
        scan.close();
	}

}
