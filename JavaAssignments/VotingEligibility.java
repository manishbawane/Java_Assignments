/*Assignment 4: Voting Eligibility
Write a program that checks if a person is eligible to vote. A 
person can vote if they are a citizen and their age is 18 or above.
Requirements:
•    Use logical && to combine conditions, and ! to negate conditions 
if necessary.*/

package Ass26;

public class VotingEligibility {
	 public static void main(String[] args) {
	      boolean citizen = false;
	      int age = 28;
	      if (citizen && age >= 18) {
	         System.out.println("person is eligible to vote");
	      } else {
	         System.out.println("person is not eligible to vote");
	      }

	   }

}
