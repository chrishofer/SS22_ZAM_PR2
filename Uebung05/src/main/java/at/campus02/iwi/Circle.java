package at.campus02.iwi;

public class Circle extends Figure {
    protected double radius;
    public Circle(double r) {
        radius = r;
    }
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

}