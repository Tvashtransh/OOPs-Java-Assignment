public class Q24 {
}
//24. Java Program to Handle Employee Age Criteria
class TooOlder extends Exception {
    public TooOlder(String message) { super(message); }  }
class TooYounger extends Exception {
    public TooYounger(String message) { super(message); }  }
class EmployeeAgeException {
    public static void main(String[] args) {
        try { int age = 18;  // Example input
            if (age > 45) { throw new TooOlder("Too old for recruitment."); }
            else if (age < 20) { throw new TooYounger("Too young for recruitment."); }
            else { System.out.println("Eligible for recruitment."); }           }
        catch (TooOlder | TooYounger e) {  System.out.println(e.getMessage()); }  }  }
