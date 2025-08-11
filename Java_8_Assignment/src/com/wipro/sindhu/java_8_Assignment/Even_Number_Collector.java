package com.wipro.sindhu.java_8_Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even_Number_Collector {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 4, 6, 7, 8, 11, 14, 17);

        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

	}

}
