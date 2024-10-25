public class Q3 {
}
// 3. Java Program to Show Parameterized Constructor
class MyClass2 {
    int x;
    public MyClass2(int x) {
        this.x = x;
        System.out.println("This is a parameterized constructor. x = " + x);  }  }
class ConstructorDemo1 {
    public static void main(String[] args) {
        MyClass2 obj = new MyClass2(10); }  }
