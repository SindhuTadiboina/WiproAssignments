package com.java.Assignment;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
public class Print_Manager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 ArrayBlockingQueue<String> printQueue = new ArrayBlockingQueue<>(3);

	        System.out.println("Enter print jobs (type 'done' to stop):");

	        while (true) {
	            System.out.print("Enter job: ");
	            String job = scan.nextLine();

	            if (job.equalsIgnoreCase("done")) {
	                break;
	            }

	            boolean added = printQueue.offer(job);
	            if (!added) {
	                System.out.println("Queue full. Job skipped: " + job);
	            }
	        }

	        System.out.println("\nPrinting jobs:");
	        while (!printQueue.isEmpty()) {
	            String job = printQueue.poll();
	            System.out.println("Printing: " + job);
	        }
	        scan.close();
	}

}
