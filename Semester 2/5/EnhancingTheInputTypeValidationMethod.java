import java.util.InputMismatchException;
import java.util.Scanner;

public class EnhancingTheInputTypeValidationMethod {
    public static void main(String[] args) {
        inputInt("Enter an Integer: ","Please Enter a Valid Number",0,100);
        inputFloat("Enter a Float: ","Please Enter a Valid Number",0,100);
    }


    public static void inputInt(String display, String errorMessage, Integer minValue, Integer maxValue) {
        Scanner input1 = new Scanner(System.in);
        int intVal = 0, count1 = 1;
        while(count1 == 1) {
            System.out.print(display);
            try {
                intVal = input1.nextInt();
                if(intVal<minValue){
                    System.err.println("Value is Below Minimum");
                }
                else if(intVal>maxValue){
                    System.err.println("Value is Above Maximum");
                } else {
                    count1 = 2;
                }
            }
            catch (InputMismatchException e) {
                System.err.println(errorMessage);
                input1.next();
            }
        }
        System.out.println("Value is: " + intVal);
    }


    public static void inputFloat(String display, String errorMessage, Integer minValue, Integer maxValue) {
        Scanner input2 = new Scanner(System.in);
        float floatVal;
        System.out.println();
        while(true) {
            System.out.println(display);
            try {
                floatVal = input2.nextFloat();
                if(floatVal<minValue){
                    System.err.println("Value is Below Minimum");
                    continue;
                }
                else if(floatVal>maxValue){
                    System.err.println("Value is Above Maximum");
                    continue;
                }
            } catch (InputMismatchException|IllegalArgumentException e) {
                System.err.println(errorMessage);
                input2.next();
                continue;
            }
            break;
        }
        System.out.println("Value is: " + floatVal);
    }
}
