// Subclass that extends Point, adds speed
public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Constructors
    public MovablePoint() {
        super(); // calls Point() no-arg constructor
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // call superclass constructor
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getters/Setters for speeds
    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[] {xSpeed, ySpeed};
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // move method (modifies x,y using getters/setters)
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    // toString() method overriding
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }
}
