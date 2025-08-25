package com.java.Assignment;
import java.util.*;
public class AverageConfusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of Elements from user: ");
		int num = scan.nextInt();
		int[] numbers = new int[5];
		int sum = 0;
		System.out.println("Enter number of Elements: " + num);
		for(int i = 0; i < num; i++) {
			numbers[i] = scan.nextInt();
			
			if(numbers[i] < 10) {
				numbers[i] = numbers[i] * 2;
			}
			
			sum += numbers[i];
		}
		
		int average = sum / num;
		System.out.println("Average number is  : " + average);
		scan.close();
	}
	
	
}
