import java.util.Scanner;
public class Q4 {
}
//4. Java Program to Swap Two Numbers

class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        // Swapping
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b); }  }
