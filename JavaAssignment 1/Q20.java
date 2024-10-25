import java.util.Scanner;
public class Q20 {
}
// 20. Java Program to Check Whether a Number is Prime or Not

class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;  }   }
        if (isPrime && num > 1)  { System.out.println(num + " is a prime number."); }
        else { System.out.println(num + " is not a prime number."); }  }  }
