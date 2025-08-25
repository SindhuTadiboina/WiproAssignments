package com.wipro.sindhu.java_8_Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Name_Sorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Sindhu", "Priya", "Jyothi", "Vinay", "Ganga");
		
		//sort sorting Lamda
		Collections.sort(names, (name1, name2) -> name1.compareTo(name2));
		
		System.out.println("Sorted Names: ");
		names.forEach(System.out::println);
		

	}

}
