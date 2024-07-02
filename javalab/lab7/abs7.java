abstract class GeometricShape {
    public abstract double area();
    public abstract double perimeter();
}

class Triangle extends GeometricShape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

class Square extends GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}

public class abs7 {
    public static void main(String[] args) {
        GeometricShape triangle = new Triangle(3.0, 4.0, 3.0, 4.0, 5.0);
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());

        GeometricShape square = new Square(4.0);
        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
    }
}
