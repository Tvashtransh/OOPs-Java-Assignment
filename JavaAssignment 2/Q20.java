public class Q20 {
}
// 20. Java Program Using Try-Catch to Generate NegativeArrayIndexException and ArithmeticException
public class MultipleExceptions {
    public static void main(String[] args) {
        try { int[] arr = new int[5];
            System.out.println(arr[-1]);  // This will throw NegativeArrayIndexException }
        catch (NegativeArrayIndexException e) { System.out.println("Error: Negative array index."); }
            try { int result = 10 / 0;  // This will throw ArithmeticException }
        catch (ArithmeticException e) { System.out.println("Error: Division by zero."); }  }  }
