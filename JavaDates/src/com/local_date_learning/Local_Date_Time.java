package com.local_date_learning;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Local_Date_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime date_time = LocalDateTime.now();
		System.out.println(date_time);
		
		
		LocalDate birthday=LocalDate.of(2001, 5, 25);
		
		LocalDate localDate = LocalDate.now();
		Period ageDiff=Period.between(birthday,localDate );
		
		System.out.println(ageDiff.getYears());
		
		LocalTime start=LocalTime.of(9, 50);
		LocalTime end=LocalTime.of(10, 50);
		
		Duration d=Duration.between(start, end);
		System.out.println(d.toMinutes());

	}

}
