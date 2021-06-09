/**
 * @author Brandon Ly
 */

public class Circle extends Shape {
    // shape vars
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    protected void calcArea() {
        this.area = Math.PI * Math.pow(radius, 2);
    }

    @Override
    protected void calcPerimeter() {
        this.perimeter = Math.PI * 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
