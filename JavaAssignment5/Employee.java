package JavaAssignment5;

class Employee extends Person {
	private double salary;

	public Employee(String name, int age, double salary) {
		super(name, age); // Call to the superclass constructor
		this.salary = salary;
	}

	public void work() {
		System.out.println(name + " is working.");
	}

	public double getSalary() {
		return salary;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println("Salary: " + salary);
	}
}
