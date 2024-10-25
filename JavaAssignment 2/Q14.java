import java.util.Scanner;
public class Q14 {
}
//14. Java Program to Calculate Gross Salary of an Employee

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;
    public Employee(int id, String name, double salary) {
        emp_id = id;
        emp_name = name;
        basic_salary = salary; }
    public double calculateGrossSalary() {
        double hra = 0.1 * basic_salary;  // 10% of basic salary
        double da = 0.2 * basic_salary;   // 20% of basic salary
        return basic_salary + hra + da;   // Gross Salary = Basic + HRA + DA }  }  }
        public class EmployeeSalary {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Employee Name: ");
                String name = sc.next();
                System.out.print("Enter Basic Salary: ");
                double salary = sc.nextDouble();
                Employee emp = new Employee(id, name, salary);
                double grossSalary = emp.calculateGrossSalary();
                System.out.println("Employee ID: " + id);
                System.out.println("Employee Name: " + name);
                System.out.println("Basic Salary: " + salary);
                System.out.println("Gross Salary: " + grossSalary); }  } } }