public class Triangle extends Shape {
    private double side1, side2, side3;

    // Constructor
    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSideLengths(double newSide1, double newSide2, double newSide3) {
        this.side1 = newSide1;
        this.side2 = newSide2;
        this.side3 = newSide3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void scale(double factor) {
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }

    @Override
    public String toString() {
        return "Triangle[" + super.toString() + ", sides=(" + side1 + ", " + side2 + ", " + side3 + ")]";
    }
}
