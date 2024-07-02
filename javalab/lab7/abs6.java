abstract class Shape2D {
    protected String color;

    public Shape2D(String color) {
        this.color = color;
    }

    public abstract void draw();
    public abstract void resize(double factor);
}

class Rectangle extends Shape2D {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + color + " rectangle with width " + width + " and height " + height);
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
        System.out.println("Resized rectangle to width " + width + " and height " + height);
    }
}

class Circle extends Shape2D {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + color + " circle with radius " + radius);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
        System.out.println("Resized circle to radius " + radius);
    }
}

public class abs6 {
    public static void main(String[] args) {
        Shape2D rectangle = new Rectangle("Red", 4.0, 5.0);
        rectangle.draw();
        rectangle.resize(1.5);

        Shape2D circle = new Circle("Blue", 3.0);
        circle.draw();
        circle.resize(2.0);
    }
}
