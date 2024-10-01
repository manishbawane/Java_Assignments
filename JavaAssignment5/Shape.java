package JavaAssignment5;

class Shape {

	public void printArea(double side) {
		double area = side * side;
		System.out.println("Area of Square: " + area);
	}

	public void printArea(double length, double breadth) {
		double area = length * breadth;
		System.out.println("Area of Rectangle: " + area);
	}

	public void printPerimeter(double side) {
		double perimeter = 4 * side;
		System.out.println("Perimeter of Square: " + perimeter);
	}

	public void printPerimeter(double length, double breadth) {
		double perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle: " + perimeter);
	}
}
