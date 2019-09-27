import java.util.InputMismatchException;
import java.util.Scanner;

public class InputTypeValidation {

    public static void main(String[] args) {
        inputInt();
        inputFloat();
    }


    public static void inputInt() {
        Scanner input1 = new Scanner(System.in);
        int intVal = 0, count1 = 1;
        while(count1 == 1) {
            System.out.println("Enter an Integer: ");
            try {
                intVal = input1.nextInt();
                count1 = 2;
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid Input");
                input1.next();
            }
        }
        System.out.println("Value is: " + intVal);
    }


    public static void inputFloat() {
        Scanner input2 = new Scanner(System.in);
        float floatVal = 0, count2 = 1;
        do{
            System.out.println("\nEnter an Float: ");
            try {
                floatVal = input2.nextFloat();
                count2 = 2;
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid Input");
                input2.next();
            }
        }while(count2 == 1);
        System.out.println("Value is: " + floatVal);
    }
}