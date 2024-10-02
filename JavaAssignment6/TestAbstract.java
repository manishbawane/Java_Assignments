package JavaAssignment6;

public class TestAbstract {
    public static void main(String[] args) {
        GeometricShape circle = new Circle(5);
        GeometricShape rectangle = new Rectangle(4, 6);
        GeometricShape triangle = new Triangle(3, 4, 3, 4, 5);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
    }
}
