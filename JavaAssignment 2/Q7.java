public class Q7 {
}
// 7. Java Program to Show Method Overriding
class Animal {
    void sound() { System.out.println("Animal makes a sound");  }  }
class Dog extends Animal {
    @Override
    void sound() { System.out.println("Dog barks"); }  }  }
class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.sound();  // Output: Animal makes a sound
        dog.sound();     // Output: Dog barks
         }  }
