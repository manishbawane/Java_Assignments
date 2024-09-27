/*Assignment 3: Door Access Control
Write a program that simulates an access control system. A person is allowed access if they have both a valid ID and a valid access card, or if they are an admin.
Requirements:
•    Use logical operators &&, ||, and !.*/


package Ass26;

public class doorAccessControl {
	 public static void main(String[] args) {
	      boolean validId = true;
	      boolean validAccessCard = false;
	      boolean isAdmin = false;
	      if ((!validId || !validAccessCard) && !isAdmin) {
	         System.out.println("not access");
	      } else {
	         System.out.println("access");
	      }

	   }
}
