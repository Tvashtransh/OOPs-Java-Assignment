public class Q10 {
}
// 10. Java Program for Fibonacci Series
 class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // length of the series
        int first = 0, second = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next; }  }  }
