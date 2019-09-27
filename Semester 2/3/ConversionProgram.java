import java.util.Scanner;

public class ConversionProgram {
    public static void main(String[] args) {
        System.out.println("Simple Conversion Program\n");
        System.out.println("1 for Kilometers to Miles");
        System.out.println("2 for Miles to Kilometers");

        Scanner answer = new Scanner(System.in);
        System.out.println("\nEnter the Choice: ");
        String choice = answer.next();

        if (choice.equals("1")) {
            System.out.println("Km to Mile Conversions");
            double kilometer = answer.nextDouble();
            System.out.println("Mile: " + kilometer * 0.621);
        }
        else if (choice.equals("2")) {
            System.out.println("Mile to Km Conversions");
            double miles = answer.nextDouble();
            System.out.println("Km: " + miles * 1.609);
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
