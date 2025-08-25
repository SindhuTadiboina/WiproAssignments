package com.java.Assignment;
	
	import java.util.PriorityQueue;
	import java.util.Comparator;
	import java.util.Scanner;

	class Patient {
	    String name;
	    int severity;
	    long timestamp;

	    public Patient(String name, int severity, long timestamp) {
	        this.name = name;
	        this.severity = severity;
	        this.timestamp = timestamp;
	    }

	    @Override
	    public String toString() {
	        return "Patient[" + name + ", Severity: " + severity + "]";
	    }
	}
	public class Emergency_Patient_Tracker {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter max number of patients (S): ");
	        int S = sc.nextInt();
	        sc.nextLine();

	        PriorityQueue<Patient> queue = new PriorityQueue<>(new Comparator<Patient>() {
	            public int compare(Patient p1, Patient p2) {
	                if (p1.severity != p2.severity) {
	                    return Integer.compare(p1.severity, p2.severity); 
	                } else {
	                    return Long.compare(p1.timestamp, p2.timestamp); 
	                }
	            }
	        });

	        // Step 3: Accept patients until user stops
	        long currentTime = 0;
	        while (true) {
	            System.out.print("\nEnter patient name (or type 'done' to finish): ");
	            String name = sc.nextLine();
	            if (name.equalsIgnoreCase("done")) break;

	            System.out.print("Enter severity (1-10): ");
	            int severity = sc.nextInt();
	            sc.nextLine(); // consume newline

	            // Check if queue is full
	            if (queue.size() >= S) {
	                System.out.println("Queue is full! Cannot add more patients.");
	                continue;
	            }

	            Patient patient = new Patient(name, severity, currentTime++);
	            queue.add(patient);
	            System.out.println("Added: " + patient);
	        }

	        // Step 4: Treat patients by priority
	        System.out.println("\n--- Treating Patients in Order ---");
	        while (!queue.isEmpty()) {
	            System.out.println("Treated: " + queue.poll());
	        }
	    }
}
