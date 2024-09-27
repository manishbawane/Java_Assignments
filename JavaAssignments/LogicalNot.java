/*Assignment 6: Logical NOT (!) for Negation
Write a program that determines whether a number is not between 10 and 20 (inclusive).
Requirements:
•    Use logical ! to negate conditions.*/


package Ass26;

import java.util.Scanner;

public class LogicalNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number");
		num = sc.nextInt();
		if (!(num >= 10 && num <= 20)) {
			System.out.println("number is not between 10 and 20 inclusive");
		} else {
			System.out.println("number is  between 10 and 20 inclusive");
		}
	}

}
