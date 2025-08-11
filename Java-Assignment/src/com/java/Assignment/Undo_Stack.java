package com.java.Assignment;
import java.util.*;

public class Undo_Stack {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Stack<String> commandStack = new Stack<>();

        System.out.println("Enter Three commands:");
        for (int i = 0; i < 3; i++) {
            String first_command = scan.nextLine();
            commandStack.push(first_command);
        }

        String last_Command = commandStack.pop();
        System.out.println("Undo_command: " + last_Command);

        String reversed_command = new StringBuilder(last_Command).reverse().toString();
        commandStack.push(reversed_command);
        System.out.println("Redo_command (reversed): " + reversed_command);

        System.out.println("\nFinal Command Stack:");
        for (int i = commandStack.size() - 1; i >= 0; i--) {
            System.out.println(commandStack.get(i));
        }
        
        scan.close();
	}

}
