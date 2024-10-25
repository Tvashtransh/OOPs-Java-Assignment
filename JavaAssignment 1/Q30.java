public class Q30 {
}
//30. Write a Java Program to Print Every Alternate Number of a Given Array
class AlternateNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Alternate numbers are:");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " "); } } }
