public class DemoProblem2 {
    public static void main(String[] args) {
        // Create a Point object
        Point point = new Point(5.0f, 6.0f);  
        System.out.println("Original Point: " + point);

        // Create a MovablePoint object
        MovablePoint movablePoint = new MovablePoint(5.0f, 6.0f, 1.0f, 1.5f);  
        System.out.println("Original MovablePoint: " + movablePoint);

        // move the MovablePoint
        movablePoint.move();
        System.out.println("After moving MovablePoint: " + movablePoint);
    }
}
