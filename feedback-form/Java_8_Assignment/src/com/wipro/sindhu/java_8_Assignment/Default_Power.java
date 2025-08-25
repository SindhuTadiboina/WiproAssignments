package com.wipro.sindhu.java_8_Assignment;

	
	interface PowerCalculator {
		int square(int num);
		default void defaultPowerInfo() {
			System.out.println("This is a default method in PowerCalculator interface.");
			}
		}

	public class Default_Power implements PowerCalculator {

		@Override
		public int square(int num) {
			return num * num;
			}
		
		public static void main(String[] args) {
			Default_Power obj = new Default_Power();
			int result = obj.square(5);
			System.out.println("Square of 5: " + result);
			obj.defaultPowerInfo();
			}
	}

}
