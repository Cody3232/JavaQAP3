public class EquilateralTriangle extends Triangle {
    // Constructor
    public EquilateralTriangle(double side, String color, boolean filled) {
        super(color, filled, side, side, side);  // parameter order
    }

    @Override
    public String toString() {
        return "EquilateralTriangle[side=" + super.getSide1() + ", " + super.toString() + "]";  
    }
}
