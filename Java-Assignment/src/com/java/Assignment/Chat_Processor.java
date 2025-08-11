package com.java.Assignment;
import java.util.concurrent.LinkedBlockingQueue;
public class Chat_Processor {

		private static final int MAX_CAPACITY = 5;
	    private static LinkedBlockingQueue<String> messageQueue = new LinkedBlockingQueue<>(MAX_CAPACITY);

	    public static void main(String[] args) {

	        Thread producer = new Thread(() -> {
	            int count = 1;
	            try {
	                while (true) {
	                    String message = "Message " + count;

	                    messageQueue.put(message);
	                    System.out.println("Added: " + message);

	                    count++;

	                    Thread.sleep(500);
	                }
	            } catch (InterruptedException e) {
	                System.out.println("Producer interrupted");
	            }
	        });

	        Thread consumer = new Thread(() -> {
	            try {
	                while (true) {

	                    String msg = messageQueue.take();
	                    System.out.println("Processed: " + msg);

	                    Thread.sleep(1000);
	                }
	            } catch (InterruptedException e) {
	                System.out.println("Consumer interrupted");
	            }
	        });

	        producer.start();
	        consumer.start();
	}

}
