import java.util.Scanner;
import java.lang.Math;

public class NewCalc {
    public static void main(String[] args) {
        System.out.println("---------Press 1 for Temperature Conversions-------");
        System.out.println("---------Press 2 for Geometry Conversions----------");
        System.out.println("---------Press 3 for Nutrition Conversions---------");
        System.out.println("---------Press 4 for Finance Conversions-----------");

        Scanner value = new Scanner(System.in);
        int ansSub;
        int answer = value.nextInt();

        switch (answer) {
            case 1:
                System.out.println("----Press 1 for Celsius to Fahrenheit Conversions----");
                System.out.println("----Press 2 for Fahrenheit to Celsius Conversions----");

                ansSub = value.nextInt();

                switch (ansSub) {
                    case 1:
                        System.out.println("Celsius to Fahrenheit Conversions");
                        System.out.print("Enter the Celsius Value: ");
                        double celsius = value.nextDouble();
                        System.out.println("Fahrenheit: " + (celsius * 9 / 5) + 32);
                        break;
                    case 2:
                        System.out.println("Fahrenheit to Celsius Conversions");
                        System.out.print("Enter the Fahrenheit Value: ");
                        double fahrenheit = value.nextDouble();
                        System.out.println("Celsius: " + (fahrenheit - 32) * 5/9);
                        break;
                }
                break;

            case 2:
                System.out.println("--------Press 1 to Find the Area of a Circle--------");
                System.out.println("----Press 2 to Find the Circumstance of a Circle----");

                ansSub = value.nextInt();

                switch (ansSub) {
                    case 1:
                        System.out.println("Area of a Circle");
                        System.out.print("Enter the Radius: ");
                        double radius = value.nextDouble();
                        System.out.println("Area : " + (radius * radius * 3.14));
                        break;
                    case 2:
                        System.out.println("Circumstance of a Circle");
                        System.out.print("Enter the Radius: ");
                        radius = value.nextDouble();
                        System.out.println("Circumstance: " + (2 * Math.PI * radius));
                        break;
                }
                break;

            case 3:
                System.out.println("Body Mass Index Calculations");
                System.out.print("Enter the Weight: ");
                double weight = value.nextDouble();
                System.out.print("Enter the Height: ");
                double height = value.nextDouble();
                System.out.println("BMI: " + (weight / height * height));
                break;

            case 4:
                System.out.println("Finance Calculations");
                System.out.print("Enter the Annual Interest Rate: ");
                double annualInterestRate = value.nextDouble();
                System.out.print("Enter the Time in Years: ");
                double timeInYears = value.nextDouble();
                System.out.println("Interest: " + (annualInterestRate / 100) * timeInYears);
                break;

            default:
                System.out.println("Invalid Choice");
        }
        System.out.println("-------------Thank You-------------");
    }
}
