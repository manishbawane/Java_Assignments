package JavaAssignment5;

class Student {

	private String name;
	private int age;
	private String address;

	public Student() {
		this.name = "unknown";
		this.age = 0;
		this.address = "not available";
	}

	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
	}
}
