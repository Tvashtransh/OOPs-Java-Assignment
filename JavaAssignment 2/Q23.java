public class Q23 {
}
//23. Java Program to Handle Temperature Exceptions
class TooHot extends Exception {
    public TooHot(String message) { super(message); }  }
class TooCold extends Exception {
    public TooCold(String message) { super(message); } }
class TemperatureExceptionDemo {
    public static void main(String[] args) {
        try { double temperature = 40;  // Example input
            if (temperature > 35) { throw new TooHot("Temperature is too hot!"); }
            else if (temperature < 5) { throw new TooCold("Temperature is too cold!"); }
            else {System.out.println("Temperature is normal. Converting to Fahrenheit: " + (temperature * 9/5 + 32));  }  }
        catch (TooHot | TooCold e) { System.out.println(e.getMessage()); }  }  }
