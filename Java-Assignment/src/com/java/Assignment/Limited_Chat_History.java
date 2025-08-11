package com.java.Assignment;
import java.util.*;
public class Limited_Chat_History {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayDeque<String> chatBox = new ArrayDeque<>();

        System.out.println("Type chat messages (type 'exit' to stop):");

        while (true) {
            System.out.print("You: ");
            String msg = scan.nextLine();

            if (msg.equalsIgnoreCase("exit")) {
                break;
            }

            if (chatBox.size() == 4) {
                chatBox.removeFirst();
            }

            chatBox.addLast(msg);

            System.out.println("Chat History:");
            for (String m : chatBox) {
                System.out.println(m);
            }
            System.out.println();
        }

        System.out.println("Final Chat History:");
        for (String m : chatBox) {
            System.out.println(m);
        }
		
		scan.close();
	}

}
