package com.java.Assignment;
import java.util.*;
public class Recent_App_Memory {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		LinkedList<String> recentApps = new LinkedList<>();

        System.out.println("Open any Five apps:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter app name: ");
            String app_name = scan.nextLine();

            if (recentApps.contains(app_name)) {
                recentApps.remove(app_name);
            }

            recentApps.addFirst(app_name);
        }

        System.out.println("Recent Apps List (Most Recent First):");
        for (String app : recentApps) {
            System.out.println(app);
        }
        
        scan.close();

	}

}
