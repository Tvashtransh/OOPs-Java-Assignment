public class Q26 {
}
// 26. Java Program to Throw an Exception if Age is Negative
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) { super(message); }  }
class AgeExceptionHandling {
    public static void main(String[] args) {
        try {  int age = -5;  // Example input
            if (age < 0) {  throw new NegativeAgeException("Age cannot be negative.");  }
            System.out.println("Age is valid."); }
        catch (NegativeAgeException e) { System.out.println(e.getMessage()); }  }  }
