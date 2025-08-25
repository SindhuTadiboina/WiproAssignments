package com.java.Assignment;
import java.util.*;
public class Grocery_Line_Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayDeque<String> queue = new ArrayDeque<>();

        System.out.print("Enter number of customers: ");
        int num = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter " + num + " customer names:");
        for (int i = 0; i < num; i++) {
            String name = scan.nextLine();

            if (name.length() % 2 == 0) {
                queue.addFirst(name);
            } else {
                queue.addLast(name);
            }
        }

        System.out.println("Serving Queue (Front to End):");
        for (String name : queue) {
            System.out.println(name);
        }
        scan.close();
	}

}
