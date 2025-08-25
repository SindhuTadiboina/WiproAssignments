package com.wipro.sindhu.java_8_Assignment;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Custom_Filter_Chain {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ankita", "Aruna", "Bhavana", "Aarti", "Divya", "Arya");

        Predicate<String> startsWithA = name -> name.startsWith("A");
        Predicate<String> endsWithA = name -> name.endsWith("a");

        List<String> filteredNames = names.stream()
                .filter(startsWithA.and(endsWithA))
                .collect(Collectors.toList());

        System.out.println("Names starting with A and ending with a: " + filteredNames);

	}

}
