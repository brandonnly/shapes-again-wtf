import java.util.Scanner;

/**
 * @author Brandon Ly
 */

public class Main {
    public static void main(String[] args) {
        // get keyboard input
        Scanner input = new Scanner(System.in);
        Shape[] shapes = new Shape[4];

        // get shapes
        // rectangle
        System.out.println("Please input the length of the rectangle: ");
        double length = Double.parseDouble(input.nextLine());
        System.out.println("Please input the width of the rectangle: ");
        double width = Double.parseDouble(input.nextLine());
        shapes[0] = new Rectangle(length, width);

        // circle
        System.out.println("Please input the radius of the circle: ");
        double radius = Double.parseDouble(input.nextLine());
        shapes[1] = new Circle(radius);

        // triangle
        System.out.println("\nPlease input the first side of the triangle: ");
        double side1 = Double.parseDouble(input.nextLine());
        System.out.println("Please input the second side of the triangle: ");
        double side2 = Double.parseDouble(input.nextLine());
        System.out.println("Please input the third side of the triangle: ");
        double side3 = Double.parseDouble(input.nextLine());
        shapes[2] = new Triangle(side1, side2, side3);

        // square
        System.out.println("\nPlease input the length of the square: ");
        double squareLength = Double.parseDouble(input.nextLine());
        shapes[3] = new Square(squareLength);

        // output shapes
        for (Shape shape : shapes) {
            System.out.println("\n" + shape.getClass().getName().toUpperCase());
            shape.calcArea();
            shape.calcPerimeter();
            System.out.println("Area = " + shape.getArea());
            System.out.println("Perimeter = " + shape.getPerimeter());
        }
    }

}
