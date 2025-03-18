public class Ellipse extends Shape {
    private double a, b; // Semi-major and semi-minor axes

    // Constructor
    public Ellipse(String color, boolean filled, double a, double b) {
        super(color, filled);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b))); // Approximation
    }

    @Override
    public String toString() {
        return "Ellipse[" + super.toString() + ", a=" + a + ", b=" + b + "]";
    }
}
