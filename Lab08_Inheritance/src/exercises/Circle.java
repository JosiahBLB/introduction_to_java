package exercises;

public class Circle extends Shape {
    private double radius;

    // Constructor for the circle class
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implements the computation for the area of a circle
    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
