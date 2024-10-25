public class Q11 {
}
// 11. Java Program for Hexadecimal and Octal Display
class Num {
    int number;
    public Num(int num) {
        number = num; }
    public void showNum() {
        System.out.println("Number: " + number); }  }
class HexNum extends Num {
    public HexNum(int num) { super(num);}

    @Override
    public void showNum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number)); }  }
class HexNumDemo {
    public static void main(String[] args) {
        HexNum hexNum = new HexNum(100);
        hexNum.showNum(); }  }
