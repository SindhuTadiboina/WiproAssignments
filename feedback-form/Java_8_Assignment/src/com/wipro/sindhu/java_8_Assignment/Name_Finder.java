package com.wipro.sindhu.java_8_Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Name_Finder {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Anu", "Bhanu", "Arjun", "Sindhu", "Akhil", "Divya");

        // Filter names that start with "A"
        List<String> aNames = names.stream()
                                   .filter(name -> name.startsWith("A"))
                                   .collect(Collectors.toList());

        System.out.println("Names starting with 'A': " + aNames);

	}

}

