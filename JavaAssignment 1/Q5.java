import java.util.Scanner;
public class Q5 {
}
 //5. Java Program to Convert Miles to Kilometers

class MilesToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in miles:");
        double miles = sc.nextDouble();
        double kilometers = miles * 1.60934;
        System.out.println(miles + " miles = " + kilometers + " kilometers."); }   }
