public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void scale(double factor) {
        this.radius *= factor;
    }

    @Override
    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}
