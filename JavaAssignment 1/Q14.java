import java.util.Scanner;

public class Q14 {
}
// 14. Java Program to Print All Multiples of 10 Between a Given Interval

class MultiplesOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start and end of the interval:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Multiples of 10 in the interval:");
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.print(i + " ");  }  }  }  }
