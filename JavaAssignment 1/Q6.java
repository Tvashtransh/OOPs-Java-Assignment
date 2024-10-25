import java.util.Scanner;
public class Q6 {
}
//6. Java Program to Check Whether a Year is a Leap Year or Not


 class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { System.out.println(year + " is a Leap Year."); }
        else { System.out.println(year + " is not a Leap Year.");  }  }   }
