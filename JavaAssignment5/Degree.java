package JavaAssignment5;

class Degree {

	public void getDegree() {
		System.out.println("I got a degree");
	}
}

class Undergraduate extends Degree {

	@Override
	public void getDegree() {
		System.out.println("I am an Undergraduate");
	}
}

class Postgraduate extends Degree {

	@Override
	public void getDegree() {
		System.out.println("I am a Postgraduate");
	}
}
