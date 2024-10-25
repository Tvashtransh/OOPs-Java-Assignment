public class Q10 {
}
//10. Java Program to Implement Vehicle Class and its Subclasses
class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    public void showData() {  System.out.println("This is a vehicle class"); }  }
class Bus extends Vehicle {
    private String routeNumber;

    public Bus(String regn, int spd, String clr, String owner, String route) {
        regnNumber = regn;
        speed = spd;
        color = clr;
        ownerName = owner;
        routeNumber = route;  }
    @Override
    public void showData() {
        super.showData();
        System.out.println("Bus Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner: " + ownerName);
        System.out.println("Route Number: " + routeNumber);  }  }
class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regn, int spd, String clr, String owner, String manufacturer) {
        regnNumber = regn;
        speed = spd;
        color = clr;
        ownerName = owner;
        manufacturerName = manufacturer; }
    @Override
    public void showData() {
        super.showData();
        System.out.println("Car Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner: " + ownerName);
        System.out.println("Manufacturer: " + manufacturerName); }   }  }
class VehicleTest {
    public static void main(String[] args) {
        Bus bus = new Bus("B1234", 80, "Blue", "John Doe", "Route 5");
        Car car = new Car("C5678", 120, "Red", "Alice Smith", "Toyota");

        bus.showData();
        System.out.println();
        car.showData(); }  }
