package JavaAssignment4;

class TrianglePeri {
    private double side1;
    private double side2;
    private double side3;

   
    public TrianglePeri(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    
    public double calculateArea() {
        double s = calculatePerimeter() / 2; 
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    
    public void display() {
        System.out.printf("Perimeter: %.2f\n", calculatePerimeter());
        System.out.printf("Area: %.2f\n", calculateArea());
    }
}

public class Main {
    public static void main(String[] args) {
        
        TrianglePeri triangle = new TrianglePeri(3, 4, 5);
        triangle.display();
    }
}

