import java.util.Scanner;
public class Q17 {
}
//17. Java Program to Find LCM of Two Numbers

class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find LCM:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = (a > b) ? a : b;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("The LCM is: " + lcm);
                break; }
            lcm++; }   }   }
