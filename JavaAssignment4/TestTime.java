package JavaAssignment4;

import java.util.Scanner;

public class TestTime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Enter hours: ");
		int hr = scanner.nextInt();
		System.out.print("Enter minutes: ");
		int min = scanner.nextInt();
		System.out.print("Enter seconds: ");
		int sec = scanner.nextInt();

		
		Time time1 = new Time(hr, min, sec);
		time1.display();

		
		Time time2 = new Time();
		time2.display();

		
		System.out.print("Enter hours for a new time: ");
		hr = scanner.nextInt();
		System.out.print("Enter minutes for a new time: ");
		min = scanner.nextInt();
		System.out.print("Enter seconds for a new time: ");
		sec = scanner.nextInt();

		time2.setTime(hr, min, sec);
		time2.display();

		scanner.close();
	}
}
