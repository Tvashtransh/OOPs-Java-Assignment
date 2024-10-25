public class Q6 {
}
//5. Java Program to Implement Inheritance
class animal {
    void sound() {
        System.out.println("Animal makes a sound."); }  }
class dog extends animal {
    void sound() { System.out.println("Dog barks."); }  }
class inheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); }  }
