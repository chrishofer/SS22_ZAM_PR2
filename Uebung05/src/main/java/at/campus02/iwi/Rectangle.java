package at.campus02.iwi;

public class Rectangle extends Figure {
    protected double length;
    protected double width;

    public Rectangle(double l, double wid) {

        length = l;
        width = wid;
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
}
