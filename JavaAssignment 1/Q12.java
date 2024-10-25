import java.util.Scanner;
public class Q12 {
}
//12. Java Program to Process Admission Based on Marks in 3 Subjects

class AdmissionCriteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks in Mathematics, Physics, Chemistry for student " + (i+1));
            int math = sc.nextInt();
            int physics = sc.nextInt();
            int chemistry = sc.nextInt();
            if ((math >= 60 && physics >= 50 && chemistry >= 40) || (math + physics >= 150)) {
                System.out.println("Student " + (i+1) + " is eligible for admission."); }
            else { System.out.println("Student " + (i+1) + " is not eligible for admission."); }  }  }  }
