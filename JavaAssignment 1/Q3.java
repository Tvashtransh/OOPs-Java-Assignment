import java.util.Scanner;
public class Q3 {
}
//3. Java Program to Find Maximum of Three Numbers

class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The maximum number is: " + max);  }   }
