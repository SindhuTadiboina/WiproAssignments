package com.wipro.sindhu.java_8_Assignment;

import com.wipro.sindhu.Java_8_Assignment.Greeting_Service;
import com.wipro.sindhu.Java_8_Assignment.MessagePrinter;

@FunctionalInterface
interface MessagePrinter{
	
	void printMessage(String message);
	
}


class Greeting_Service {
	
	 public static void sendGreeting(String name, MessagePrinter printer) {
	        printer.printMessage("Hello, " + name + "! Welcome to Java 8.");
	    }
}


public class Greetings_Printer {

	public static void main(String[] args) {
		
		 // Lambda passed as function
        MessagePrinter printer = msg -> System.out.println(msg);

        
        Greeting_Service.sendGreeting("Sindhu", printer);

	}

}


