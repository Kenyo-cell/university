public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }

    public Square(double width, String color, boolean filled) {
        super(width, width, color, filled);
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    public double getLength() {
        return width;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
