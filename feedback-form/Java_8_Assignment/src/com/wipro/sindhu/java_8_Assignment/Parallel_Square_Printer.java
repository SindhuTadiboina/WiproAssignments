package com.wipro.sindhu.java_8_Assignment;

import java.util.Arrays;
import java.util.List;

public class Parallel_Square_Printer {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        nums.parallelStream()
            .forEach(n -> System.out.println("Square of " + n + " = " + (n * n)
                + " - Thread: " + Thread.currentThread().getName()));

	}

}
