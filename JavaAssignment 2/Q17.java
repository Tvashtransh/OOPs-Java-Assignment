import java.util.Scanner;
public class Q17 {
}
// 17. Java Program to Find Sum of Numbers Formed by Consecutive Digits

class ConsecutiveDigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String str = Integer.toString(number);
        int sum = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            int firstNum = Integer.parseInt(str.substring(i, i + 2));
            sum += firstNum; }
        System.out.println("Sum of numbers formed by consecutive digits: " + sum); }  }
