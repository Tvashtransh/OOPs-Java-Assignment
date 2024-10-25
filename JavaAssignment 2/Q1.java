import java.util.Scanner;
public class Q1 {
}
//1. Java Program to Merge Two Sorted Arrays into One Sorted Array


class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array A:");
        int n1 = sc.nextInt();
        int[] A = new int[n1];
        System.out.println("Enter elements of array A:");
        for (int i = 0; i < n1; i++) {  A[i] = sc.nextInt(); }
        System.out.println("Enter the size of array B:");
        int n2 = sc.nextInt();
        int[] B = new int[n2];
        System.out.println("Enter elements of array B:");
        for (int i = 0; i < n2; i++) { B[i] = sc.nextInt(); }

        int[] C = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (A[i] < B[j]) { C[k++] = A[i++]; }
            else { C[k++] = B[j++]; }  }
        while (i < n1) { C[k++] = A[i++]; }
        while (j < n2) { C[k++] = B[j++]; }
        System.out.println("Merged array C:");
        for (int x : C) { System.out.print(x + " "); }  }  }
