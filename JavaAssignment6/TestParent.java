package JavaAssignment6;

public class TestParent {
	public static void main(String[] args) {

		A.print(); // Outputs: Parent
		B.print(); // Outputs: Child

		A obj = new B();
		obj.print();
	}
}
