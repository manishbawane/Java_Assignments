/*Assignment 1: Validating Age and Income
Write a program that checks if a person is eligible for a loan based on their age and income.
Requirements:
•    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
•    Use logical && to combine these conditions.*/


package Ass26;

public class valiAgeInc {
	  public static void main(String[] args) {
	      int age = 25;
	      int income = 3000;
	      if (age >= 18 && age <= 60 && income < 25000) {
	         System.out.println("A person is eligible loan ");
	      } else {
	         System.out.println("A person is not eligible loan ");
	      }

	   }

}
