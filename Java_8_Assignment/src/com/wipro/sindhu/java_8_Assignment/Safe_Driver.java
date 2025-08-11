package com.wipro.sindhu.java_8_Assignment;

import java.util.Optional;

public class Safe_Driver {
	
	    public static Optional<Double> divide(double a, double b) {
	        if (b == 0) {
	            return Optional.empty(); 
	        } else {
	            return Optional.of(a / b);
	        }
	    }

	    public static void main(String[] args) {
	        Optional<Double> result1 = divide(20, 2);
	        Optional<Double> result2 = divide(5, 0);

	        System.out.println("Result 1:");
	        result1.ifPresentOrElse(
	            val -> System.out.println("Result: " + val),
	            () -> System.out.println("Not Allowed")
	        );

	        System.out.println("Result 2:");
	        result2.ifPresentOrElse(
	            val -> System.out.println("Result: " + val),
	            () -> System.out.println("Not Allowed"));
	    }
}
