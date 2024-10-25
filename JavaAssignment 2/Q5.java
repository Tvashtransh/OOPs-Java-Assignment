public class Q5 {
}
// 5. Java Program to Implement Inheritance
class Animal {
    void sound() {
        System.out.println("Animal makes a sound."); }  }
class Dog extends Animal {
    void sound() { System.out.println("Dog barks."); }  }
class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); }  }
