public class Q25 {
}
// 25. Java Program to Check Username and Password Length
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) { super(message); }  }

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) { super(message); }  }


class UsernamePasswordValidation {
    public static void main(String[] args) { try {
        String username = "user";  // Example input
        String password = "123";   // Example input
        if (username.length() < 6) {
            throw new InvalidUsernameException("Username must be at least 6 characters."); }
        if (!password.equals("password123")) {
            throw new InvalidPasswordException("Incorrect password."); }
        System.out.println("Username and Password are valid."); }
    catch (InvalidUsernameException | InvalidPasswordException e) {
        System.out.println(e.getMessage()); }  }  }
