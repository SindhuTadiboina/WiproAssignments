package com.java.Assignment;
import java.util.*;

class Job {
	String name;
	int urgency;
	Job(String name, int urgency) {
		this.name = name;
		this.urgency = urgency;
		}
	
	@Override
	public String toString() {
		return name + " (Urgency: " + urgency + ")";
		}
	}

public class Smart_Job_Picker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PriorityQueue<Job> jobQueue = new PriorityQueue<>(new Comparator<Job>() {
			public int compare(Job j1, Job j2) {
				if (j1.urgency != j2.urgency) {
					return Integer.compare(j1.urgency, j2.urgency);
					} else {
						return Integer.compare(j1.name.length(), j2.name.length());
						}
		            }
		        });

		        System.out.print("Enter number of jobs: ");
		        int n = scan.nextInt();
		        scan.nextLine(); 
		        for (int i = 0; i < n; i++) {
		            System.out.print("Enter job name: ");
		            String name = scan.nextLine();
		            System.out.print("Enter urgency (1-5): ");
		            int urgency = scan.nextInt();
		            scan.nextLine();

		            jobQueue.add(new Job(name, urgency));
		        }

		        System.out.println("\nJobs in priority order:");
		        while (!jobQueue.isEmpty()) {
		            System.out.println(jobQueue.poll());
		        }
		        scan.close();
	}

}
