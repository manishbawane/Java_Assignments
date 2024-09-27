/*Assignment 5: Job Application
Write a program that checks if a person is eligible for a job based on their qualifications. A person is eligible if they have a bachelor’s degree or equivalent experience, and they have a clean criminal record.
Requirements:
•    Use logical operators to combine conditions.*/

package Ass26;

import java.util.Scanner;

public class JobApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean bachelorsDegree;
		boolean equivalentExperience;
		boolean cleanRecord;
		System.out.println("the person have a bachelor's degree?= (true/false) ");
		bachelorsDegree = sc.nextBoolean();
		System.out.println("the person have equivalent experience? (true/false) ");
		equivalentExperience = sc.nextBoolean();
		System.out.println("the person have a clean criminal record? (true/false) ");
		cleanRecord = sc.nextBoolean();
		if ((bachelorsDegree || equivalentExperience) && cleanRecord) {
			System.out.println("person is eligible for the job");
		} else {
			System.out.println("person is not eligible for the job");
		}
	}
}
