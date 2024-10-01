package JavaAssignment4;

class Time {
	private int hours;
	private int minutes;
	private int seconds;

	
	public Time(int hours, int minutes, int seconds) {
		setTime(hours, minutes, seconds);
	}

	
	public Time() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}

	
	public void setTime(int hours, int minutes, int seconds) {
		if (isValidTime(hours, minutes, seconds)) {
			this.hours = hours;
			this.minutes = minutes;
			this.seconds = seconds;
		} else {
			System.out.println("Invalid time! Setting to default (00:00:00).");
			this.hours = 0;
			this.minutes = 0;
			this.seconds = 0;
		}
	}

	
	private boolean isValidTime(int hours, int minutes, int seconds) {
		return (hours >= 0 && hours < 24) && (minutes >= 0 && minutes < 60) && (seconds >= 0 && seconds < 60);
	}

	
	public void display() {
		System.out.printf("Time: %02d:%02d:%02d\n", hours, minutes, seconds);
	}
}
