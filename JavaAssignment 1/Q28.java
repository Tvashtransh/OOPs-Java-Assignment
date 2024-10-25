import java.util.Scanner;
public class Q28 {
}
// 28. Write a Java Program to Find the Sum of All Odd Numbers in an Array

class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) { arr[i] = sc.nextInt(); }
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num; }  }   System.out.println("Sum of odd numbers is: " + sum); }  }
