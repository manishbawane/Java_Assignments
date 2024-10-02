package JavaAssignment6;

public final class Person {
	private final String name;
	private final int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		return age == other.age && name.equals(other.name);
	}

	@Override
	public int hashCode() {
		return 31 * name.hashCode() + age;
	}

	public static void main(String[] args) {
		Person person1 = new Person("Manish", 24);
		Person person2 = new Person("Saurav", 25);

		System.out.println(person1);
		System.out.println(person2);
	}
}
