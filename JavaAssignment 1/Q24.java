import java.util.Scanner;
public class Q24 {
}
// 24. Java Program for Sum & Average of an Integer Array

class SumAverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i]; }
        double average = sum / (double) size;
        System.out.println("Sum: " + sum + ", Average: " + average); }  }
