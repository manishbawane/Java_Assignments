/*Assignment 7: Weather Conditions
Write a program that determines whether it's safe to go outside based on temperature and weather conditions. The conditions to go outside are:
•    Temperature should be between 20°C and 30°C.
•    It should not be raining.
Requirements:
•    Use logical operators && and !.*/


package Ass26;

import java.util.Scanner;

public class WeatherConditions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean raining;
		float temp;
		System.out.println("Enter temperature in C ");
		temp = sc.nextFloat();
		System.out.println("raining? (true/false)");
		raining = sc.nextBoolean();
		if (temp >= 20 && temp <= 30 && !raining) {
			System.out.println("to go outside");
		} else {
			System.out.println(" not to go outside");
		}

	}

}
