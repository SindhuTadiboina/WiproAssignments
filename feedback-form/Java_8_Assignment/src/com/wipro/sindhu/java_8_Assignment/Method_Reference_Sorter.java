package com.wipro.sindhu.java_8_Assignment;

import java.util.Arrays;
import java.util.List;

public class Method_Reference_Sorter {

	public static void main(String[] args) {
		
		 List<String> names = Arrays.asList("Sindhu", "Anu", "Jyothi", "Divya");

	        names.sort(String::compareToIgnoreCase);

	        System.out.println("Sorted Names: " + names);

	}

}
