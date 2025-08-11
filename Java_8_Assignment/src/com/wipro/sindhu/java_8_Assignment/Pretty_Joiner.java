package com.wipro.sindhu.java_8_Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pretty_Joiner {

	public static void main(String[] args) {
		
		List<String> cities = Arrays.asList("Hyderabad", "Bangalore", "Chennai", "Mumbai", "Delhi");

        String result = cities.stream()
                              .collect(Collectors.joining(", "));

        System.out.println("City List: " + result);

	}

}