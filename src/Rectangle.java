/**
 * @author Brandon Ly
 */

public class Rectangle extends Shape {
    // rectangle vars
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    protected void calcArea() {
        this.area = length * width;
    }

    @Override
    protected void calcPerimeter() {
        this.perimeter = length*2 + width*2;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
