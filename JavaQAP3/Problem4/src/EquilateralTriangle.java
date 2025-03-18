public class EquilateralTriangle extends Triangle {
    // Constructor
    public EquilateralTriangle(String color, boolean filled, double side) {
        super(color, filled, side, side, side);
    }

    @Override
    public String toString() {
        return "EquilateralTriangle[" + super.toString() + "]";
    }

    @Override
    public void scale(double factor) {
        double newSide = super.getSide1() * factor;
        super.setSideLengths(newSide, newSide, newSide);
    }
}
