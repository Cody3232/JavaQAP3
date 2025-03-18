public class DemoProblem3 {
    public static void main(String[] args) {

        // Testing Circle
        Circle circle = new Circle("Blue", true, 5.0);
        System.out.println(circle);

        // Testing Ellipse
        Ellipse ellipse = new Ellipse("Green", false, 4.0, 2.0);
        System.out.println(ellipse);

        // Testing Triangle (valid triangle)
        Triangle triangle = new Triangle("Yellow", true, 3.0, 4.0, 5.0);
        System.out.println(triangle);

        // Testing EquilateralTriangle
        EquilateralTriangle eqTriangle = new EquilateralTriangle(6.0, "Red", false); // Can't seem to figure out this issue?
        System.out.println(eqTriangle);
    }
}
