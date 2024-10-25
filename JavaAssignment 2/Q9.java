import java.util.Scanner;
public class Q9 {
}
// 9. Java Program to Implement Inheritance with Three-Dimensional Objects


class ThreeDObject {
    double surfaceArea() { return 0; }
    double volume() { return 0; }  }
class Box extends ThreeDObject {
    double length, breadth, height;
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h; }
    @Override
    double surfaceArea() { return 2 * (length * breadth + breadth * height + height * length); }
    @Override
    double volume() { return length * breadth * height;  }  }
class Cube extends Box {
    Cube(double side) {
        super(side, side, side); }  }
class Cylinder extends ThreeDObject {
    double radius, height;
    Cylinder(double r, double h) {
        radius = r;
        height = h; }
    @Override
    double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);  }
    @Override
    double volume() {
        return Math.PI * Math.pow(radius, 2) * height; }  }
class Cone extends ThreeDObject {
    double radius, height;
    Cone(double r, double h) {
        radius = r;
        height = h;  }  }
@Override
double surfaceArea() {
    return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2))); }
@Override
double volume() {
    return (Math.PI * Math.pow(radius, 2) * height) / 3; }  }
public class ThreeDObjectsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions for Box (length, breadth, height):");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        Box box = new Box(l, b, h);

        System.out.println("Box Surface Area: " + box.surfaceArea());
        System.out.println("Box Volume: " + box.volume());
        System.out.println("Enter side length for Cube:");
        double side = sc.nextDouble();
        Cube cube = new Cube(side);

        System.out.println("Cube Surface Area: " + cube.surfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        System.out.println("Enter radius and height for Cylinder:");
        double r = sc.nextDouble();
        h = sc.nextDouble();
        Cylinder cylinder = new Cylinder(r, h);

        System.out.println("Cylinder Surface Area: " + cylinder.surfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        System.out.println("Enter radius and height for Cone:");
        r = sc.nextDouble();
        h = sc.nextDouble();
        Cone cone = new Cone(r, h);

        System.out.println("Cone Surface Area: " + cone.surfaceArea());
        System.out.println("Cone Volume: " + cone.volume()); }  }
