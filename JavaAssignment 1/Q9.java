public class Q9 {
}
//9. Java Program to Calculate Factorial of 12
class Factorial {
    public static void main(String[] args) {
        int number = 12;
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i++; }
        System.out.println("Factorial of 12 is: " + factorial); }   }
