/**
 * @author Brandon Ly
 */

public abstract class Shape {
    // member variables
    protected double area;
    protected double perimeter;

    // member functions
    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    // abstract member functions
    protected abstract void calcArea();
    protected abstract void calcPerimeter();
}
