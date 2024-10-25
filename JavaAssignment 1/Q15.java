import java.util.Scanner;
public class Q15 {
}
//15. Java Program to Generate Multiplication Table

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the multiplication table:");
        int number = sc.nextInt();
        System.out.println("Multiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i)); }  }  }
