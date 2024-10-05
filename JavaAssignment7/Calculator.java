package JavaAssignment7;

public class Calculator {
	private int num1;
	private int num2;

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int Add() {
		if (num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Both numbers must be positive for addition.");
		}
		return num1 + num2;
	}

	public int Subtract() {
		if (num1 < 0 || num2 < 0) {
			throw new ArithmeticException("Both numbers must be positive for subtraction.");
		}
		return num1 - num2;
	}

	public int Multiply() {
		if (num1 == 0 || num2 == 0) {
			throw new ArithmeticException("Neither number can be zero for multiplication.");
		}
		return num1 * num2;
	}

	public double Division() {
		if (num1 == 0 || num2 == 0) {
			throw new ArithmeticException("Neither number can be zero for division.");
		}
		return (double) num1 / num2;
	}
}
