package JavaAssignment6;

public class TestEngine {
	public static void main(String[] args) {
		Engine engine = new Engine("V4", 125);
		Car car = new Car(engine);

		car.displayEngineDetails();

		System.out.println("Start the car");
		car.start();
		System.out.println("Stop the car");
		car.stop();

		System.out.println("==================================");
	}
}
