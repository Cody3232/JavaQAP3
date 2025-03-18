public class Demo {
    public static void main(String[] args) {
        // Creating shapes
        Scalable[] shapes = {
            new Circle("Blue", true, 5.0),
            new Ellipse("Green", false, 4.0, 2.0),
            new Triangle("Yellow", true, 3.0, 4.0, 5.0),
            new EquilateralTriangle("Red", false, 6.0)
        };

        // Print original shapes
        System.out.println("Before Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        // Apply scaling
        double scaleFactor = 1.5;
        scaleAll(shapes, scaleFactor);

        // Print scaled shapes
        System.out.println("\nAfter Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    // Method to scale all shapes
    public static void scaleAll(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}
