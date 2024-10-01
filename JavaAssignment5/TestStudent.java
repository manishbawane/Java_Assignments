package JavaAssignment5;

public class TestStudent {
	public static void main(String[] args) {

		Student[] students = new Student[10];

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}

		students[0].setInfo("boby", 20, "123 nashik");
		students[1].setInfo("dolly", 22, "456 nashik");
		students[2].setInfo("ramu", 19);
		students[3].setInfo("shamu", 21, "789 nashik");
		students[4].setInfo("tinku", 23);
		students[5].setInfo("minku", 20, "101 nashik");
		students[6].setInfo("rinku", 22, "100 nashik");
		students[7].setInfo("tia", 24, "202 nashik");
		students[8].setInfo("isha", 19, "344 nashik");
		students[9].setInfo("priya", 21, "303 nashik");

		for (Student student : students) {
			student.displayInfo();
		}
	}
}
