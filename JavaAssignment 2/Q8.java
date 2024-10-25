public class Q8 {
}
// 8. Java Program to Show Method Hiding
class Animal {
    static void sound() { System.out.println("Animal makes a sound"); }  }
class Dog extends Animal {
    static void sound() { System.out.println("Dog barks"); }  }
public class MethodHiding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        animal.sound();  // Output: Animal makes a sound
        dog.sound();     // Output: Animal makes a sound (method hiding happens)
        }  }
