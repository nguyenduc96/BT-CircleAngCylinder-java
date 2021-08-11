public class Circle {
    private double radius = 1.0;
    private String color = "yelow";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                ", color= '" + color + '\'' +
                '}';
    }
}
