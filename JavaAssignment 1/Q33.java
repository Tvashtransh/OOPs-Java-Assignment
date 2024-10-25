import java.util.Scanner;
public class Q33 {
}
// 33. Write a Class, Commission, and Test It

class Commission {
    double sales;
    public Commission(double sales) {
        this.sales = sales; }
    public double commission() {
        return 0.1 * sales;  // 10% commission
        }  }
class CommissionTest {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter sales amount: ");
                double sales = sc.nextDouble();
                if (sales < 0) { System.out.println("Invalid Input"); }
                else { Commission comm = new Commission(sales);
                    System.out.println("Commission: " + comm.commission()); }
            } }

