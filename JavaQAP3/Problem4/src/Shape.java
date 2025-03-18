public abstract class Shape implements Scalable {
    protected String color;
    protected boolean filled;

    // Constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter/Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}
