public class Q18 {
}
// 18. Java Program to Create Three Interfaces and Implement Them
interface Interface1 {
    void method1();
    void method2(); }
interface Interface2 {
    void method3();
    void method4(); }
interface Interface3 {
    void method5();
    void method6(); }
interface CombinedInterface extends Interface1, Interface2, Interface3 { void method6(); }
class MyClass implements CombinedInterface {
    public void method1() { System.out.println("Method 1 from Interface1");  }
    public void method2() { System.out.println("Method 2 from Interface1");  }
    public void method3() { System.out.println("Method 3 from Interface2");  }
    public void method4() { System.out.println("Method 4 from Interface2");  }
    public void method5() { System.out.println("Method 5 from Interface3");  }
    public void method6() {System.out.println("Method 6 from Interface3");   }  }  }  }
class InterfaceExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();  }  }
