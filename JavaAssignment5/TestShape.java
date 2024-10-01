package JavaAssignment5;

public class TestShape {
	public static void main(String[] args) {
		Shape shape = new Shape();

		double squareSide = 5.0;
		shape.printArea(squareSide);
		shape.printPerimeter(squareSide);

		double rectangleLength = 4.0;
		double rectangleBreadth = 6.0;
		shape.printArea(rectangleLength, rectangleBreadth);
		shape.printPerimeter(rectangleLength, rectangleBreadth);
	}
}
