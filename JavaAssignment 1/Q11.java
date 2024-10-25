import java.util.Scanner;
public class Q11 {
}
//11. Java Program to Reverse a Number

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse:");
        int num = sc.nextInt();
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10; }
        System.out.println("Reversed Number: " + reversed); }   }
