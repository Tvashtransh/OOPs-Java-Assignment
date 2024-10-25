public class Q32 {
}
//32. Write a Java Program to Show Parameterized Constructor
class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age; }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age); }  }
class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s = new Student("John", 20);
        s.display();  }  }
