package com.java.Assignment;
import java.util.*;
public class ReversedTaskQueue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		LinkedList<String> taskList = new LinkedList<>();
		System.out.println("Enter 4 task names:");
	    for (int i = 0; i < 4; i++) {
	    	String task = scan.nextLine();
	        if (task.endsWith("end")) {
	        	taskList.addLast(task); 
	            } else {
	                taskList.addFirst(task); 
	            }
	     }
	     
	     System.out.println("Final task list:");
	        for (String task : taskList) {
	            System.out.println(task);
	        }
	        scan.close();
	}

}
