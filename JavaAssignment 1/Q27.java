import java.util.Scanner;
public class Q27 {
}
 //27. Write a Java Program to Enter n Elements in an Array and Find the Smallest Number Among Them

class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) { arr[i] = sc.nextInt(); }
        int smallest = arr[0];
        for (int i = 1; i < n; i++) { if (arr[i] < smallest) { smallest = arr[i]; }  }
        System.out.println("Smallest number is: " + smallest); }  }
