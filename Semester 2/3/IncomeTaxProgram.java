import java.util.Scanner;

public class IncomeTaxProgram {
    public static void main(String[] args) {
        System.out.println("***** Income Tax Program *****\n");
        Scanner answer = new Scanner(System.in);
        System.out.print("Please Enter the Your Income: ");
        double income = answer.nextDouble();

        if (income > 0 && income <= 18200) {
            System.out.println("You Don't Need to Pay Income Tax for This Year");
        }
        else if (income <= 37000) {
            System.out.println("Tax on this Income: " + (income - 18200)*0.19);
        }
        else if (income <= 80000) {
            System.out.println("Tax on this Income: " + ((income - 37000)*0.325) + 3572);
        }
        else if (income <= 180000) {
            System.out.println("Tax on this Income: " + ((income - 80000)*0.37) + 17547);
        }
        else {
            System.out.println("Tax on this Income: " + ((income - 180000)*0.45) + 54547);
        }
    }
}
