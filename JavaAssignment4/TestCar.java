package JavaAssignment4;

import java.util.Scanner;

	public class TestCar {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        Car[] cars = new Car[3];

	        
	        for (int i = 0; i < 3; i++) {
	            cars[i] = new Car(); 
	            System.out.println("Enter details for Car " + (i + 1) + ":");

	            System.out.print("Car Model: ");
	            String model = scanner.nextLine();

	            System.out.print("Car Name: ");
	            String name = scanner.nextLine();

	            System.out.print("Car Price: ");
	            double price = scanner.nextDouble();
	            scanner.nextLine(); 

	            System.out.print("Car Owner: ");
	            String owner = scanner.nextLine();

	            
	            cars[i].assignValues(model, name, price, owner);
	        }

	      
	        System.out.println("\nCar Information:");
	        for (Car car : cars) {
	            car.display();
	        }

	        scanner.close();
	    }
	}



