import java.util.Scanner;
public class Q21 {
}
//21. Java Program to Convert Binary Number to Decimal and Decimal to Binary

class BinaryDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a binary number:");
        String binary = sc.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Binary " + binary + " = Decimal " + decimal);
        System.out.println("Enter a decimal number:");
        int decimalNum = sc.nextInt();
        String binaryResult = Integer.toBinaryString(decimalNum);
        System.out.println("Decimal " + decimalNum + " = Binary " + binaryResult); }  }
