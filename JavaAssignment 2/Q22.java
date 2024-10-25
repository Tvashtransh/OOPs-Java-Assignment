public class Q22 {
}
// 22. Java Program to Create Custom Exception for Arithmetic Errors
class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {  super(message);  }  }
public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try { int result = 10 / 0;  // This will throw ArithmeticException
            if (result < 0) { throw new CustomArithmeticException("Custom exception: Negative result"); }}
        catch (ArithmeticException | CustomArithmeticException e){system.out.println(e.getMessage());
        }  }  }
