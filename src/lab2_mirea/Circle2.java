package lab2_mirea;

public class Circle2 {
    private double x;
    private double y;
    private double radius;

    public Circle2(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        setRadius(radius);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (!Double.isFinite(radius) || radius <= 0) {
            throw new IllegalArgumentException(
                    "Радиус должен быть конечным числом больше нуля"
            );
        }

        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public int compareRadius(Circle2 other) {
        return Double.compare(this.radius, other.radius);
    }

    @Override
    public String toString() {
        return "Circle2{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
}