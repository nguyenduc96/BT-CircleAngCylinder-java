public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "red");
        System.out.println(circle.toString());
        System.out.println("Perimeter = " + circle.getPerimeter());
        System.out.println("Area = " + circle.getArea() + "\n");

        Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 5.0);
        System.out.println(cylinder.toString());
        System.out.println("Volume = " + cylinder.getVolume());
    }
}
