package com.wipro.sindhu.java_8_Assignment;

import java.util.Arrays;
import java.util.List;

public class Word_Counter {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Sindhu", "Priya", "Anuradha", "Manju", "Ramya", "Krishna");

        long count = names.stream()
                          .filter(name -> name.length() > 5)
                          .count();

        System.out.println("Names longer than 5 characters: " + count);

	}

}

