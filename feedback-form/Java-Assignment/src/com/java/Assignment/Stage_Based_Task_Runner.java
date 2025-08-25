package com.java.Assignment;

import java.util.concurrent.LinkedBlockingQueue;

public class Stage_Based_Task_Runner {

    // Make Task static so it can be used in static context
    static class Task {
        int id;
        String name;

        Task(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Task[" + id + ": " + name + "]";
        }
    }

    private static LinkedBlockingQueue<Task> stage1Queue = new LinkedBlockingQueue<>();
    private static LinkedBlockingQueue<Task> stage2Queue = new LinkedBlockingQueue<>();

    public static void main(String[] args) {

        // Producer: Adds tasks to Stage 1
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                Task task = new Task(i, "Task" + i);
                try {
                    stage1Queue.put(task);
                    System.out.println("Added to Stage 1: " + task);
                    Thread.sleep(300); // simulate input delay
                } catch (InterruptedException e) {
                    System.out.println("Producer interrupted");
                }
            }
        });

        // Processor: Moves even-ID tasks from Stage 1 to Stage 2
        Thread stage1Processor = new Thread(() -> {
            try {
                while (true) {
                    Task task = stage1Queue.take();
                    System.out.println("Processing in Stage 1: " + task);

                    if (task.id % 2 == 0) {
                        stage2Queue.put(task);
                        System.out.println("Moved to Stage 2: " + task);
                    } else {
                        System.out.println("Filtered out (odd ID): " + task);
                    }

                    Thread.sleep(500); // simulate processing time
                }
            } catch (InterruptedException e) {
                System.out.println("Stage 1 Processor interrupted");
            }
        });

        // Consumer: Processes tasks in Stage 2
        Thread stage2Processor = new Thread(() -> {
            try {
                while (true) {
                    Task task = stage2Queue.take();
                    System.out.println("Processing in Stage 2: " + task);
                    Thread.sleep(700); // simulate final processing
                }
            } catch (InterruptedException e) {
                System.out.println("Stage 2 Processor interrupted");
            }
        });

        // Start all threads
        producer.start();
        stage1Processor.start();
        stage2Processor.start();
    }
}
