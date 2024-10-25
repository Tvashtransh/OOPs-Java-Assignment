public class Q16 {
}
// 16. Java Program to Demonstrate the Use of static Keyword
class Counter {
    static int count = 0;  // Static variable, shared by all instances
    Counter() { count++;  // Increment count for each instance }

        static void displayCount() { System.out.println("Total instances: " + count); }  }
    public class StaticKeywordExample {
        public static void main(String[] args) {
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            Counter c3 = new Counter();
            Counter.displayCount();  // Output: Total instances: 3
            }  } }
