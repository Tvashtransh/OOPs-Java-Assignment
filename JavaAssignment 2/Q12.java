public class Q12 {
}
//12. Java Program for Multilevel Inheritance
class Vehicle {
    void displayVehicle() {
        System.out.println("This is a vehicle."); }  }
class Car extends Vehicle {
    void displayCar() {
        System.out.println("This is a car.");  }  }

class SportsCar extends Car {
    void displaySportsCar() {
        System.out.println("This is a sports car."); }  }
class MultilevelInheritance {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.displayVehicle();
        sc.displayCar();
        sc.displaySportsCar(); }  }
