package JavaAssignment6;

class Engine {
	private String type;
	private int horsepower;

	public Engine(String type, int horsepower) {
		this.type = type;
		this.horsepower = horsepower;
	}

	public String getType() {
		return type;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public String getDetails() {
		return "Engine Type: " + type + ", Horsepower: " + horsepower;
	}
}

class Car {
	private Engine engine;
	private boolean isRunning;

	public Car(Engine engine) {
		this.engine = engine;
		this.isRunning = false;
	}

	public void start() {
		if (!isRunning) {
			isRunning = true;
			System.out.println("Car started.");
		} else {
			System.out.println("Car is already running.");
		}
	}

	public void stop() {
		if (isRunning) {
			isRunning = false;
			System.out.println("Car stopped.");
		} else {
			System.out.println("Car is already stopped.");
		}
	}

	public void displayEngineDetails() {
		System.out.println(engine.getDetails());
	}
}
