package JavaAssignment5;

class HRManager extends Employee {

	public HRManager(String name, int age, double salary) {
		super(name, age, salary); // Call to the superclass constructor
	}

	@Override
	public void work() {
		System.out.println(name + " is managing the HR department.");
	}

	public void addEmployee(String employeeName) {
		System.out.println(name + " has added a new employee: " + employeeName);
	}
}
