import java.util.Scanner;

public class GradeCalculation {
    public static void main(String[] args) {
        System.out.println("Grade Calculation\n");
        Scanner answer = new Scanner(System.in);
        System.out.print("Enter the Marks: ");
        int marks = answer.nextInt();
        System.out.print("Did You Pass the Exam? (y/n): ");
        String examPass = answer.next().toLowerCase();

        if (marks >= 50 && examPass.equals("y")) {
            if (marks >= 70 && marks <= 100) {
                System.out.println("HD");
            }
            else if (marks >= 60) {
                System.out.println("D");
            }
            else {
                System.out.println("Pass");
            }
        }
        else if (marks < 50 || examPass.equals("n")) {
            System.out.println("Fail/Incomplete");
        }
        else
            System.out.println("Invalid Input");
    }
}