package JavaAssignment5;

public class TestPerson {
	public static void main(String[] args) {

		HRManager hrManager = new HRManager("Manish", 24, 80000);

		hrManager.displayInfo();

		hrManager.work();
		hrManager.addEmployee("Tia");
		
	}
}