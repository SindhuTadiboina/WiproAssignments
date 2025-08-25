package com.wipro.sindhu.java_8_Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency_Mapper {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Anu", "Arjun", "Anu", "Ravi", "Ravi", "Arjun", "Ravi");

        Map<String, Long> frequencyMap = names.stream()
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        System.out.println("Name Frequencies: " + frequencyMap);

	}

}
