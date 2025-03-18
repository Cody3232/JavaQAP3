// Class representing a point in 2D space
public class Point {
    // private variables (only accessible within this class)
    private float x = 0.0f;
    private float y = 0.0f;

    // Constructors
    public Point() {
        // no-arg constructor, default (0,0)
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters/Setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[] {x, y};
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // toString() method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
