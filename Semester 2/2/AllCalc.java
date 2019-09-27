import java.util.Scanner;

public class AllCalc {
    public static void main(String[] args) {
        System.out.println("---------Press 1 for Length Conversions---------");
        System.out.println("---------Press 2 for Weight Conversions---------");
        System.out.println("---------Press 3 for Volume Conversions---------");

        Scanner value = new Scanner(System.in);
        int ansSub;
        int answer = value.nextInt();

        switch (answer) {
            case 1:
                System.out.println("---------Press 1 for Cm to Inch Conversions-----------");
                System.out.println("---------Press 2 for Inch to Cm Conversions-----------");
                System.out.println("---------Press 3 for Meter to Foot Conversions--------");
                System.out.println("---------Press 4 for Foot to Meter Conversions--------");
                System.out.println("---------Press 5 for Km to Mile Conversions-----------");
                System.out.println("---------Press 6 for Mile to Km Conversions-----------");

                ansSub = value.nextInt();

                switch (ansSub) {
                    case 1:
                        System.out.println("Cm to Inch Conversions");
                        double cm = value.nextDouble();
                        System.out.println("Inch: " + cm * 0.393);
                        break;
                    case 2:
                        System.out.println("Inch to Cm Conversions");
                        double inch = value.nextDouble();
                        System.out.println("Cm: " + inch * 2.54);
                        break;
                    case 3:
                        System.out.println("Meter to Foot Conversions");
                        double meter = value.nextDouble();
                        System.out.println("Foot: " + meter * 3.281);
                        break;
                    case 4:
                        System.out.println("Foot to Meter Conversions");
                        double feet = value.nextDouble();
                        System.out.println("Meter: " + feet * 0.305);
                        break;
                    case 5:
                        System.out.println("Km to Mile Conversions");
                        double kilometer = value.nextDouble();
                        System.out.println("Mile: " + kilometer * 0.621);
                        break;
                    case 6:
                        System.out.println("Mile to Km Conversions");
                        double miles = value.nextDouble();
                        System.out.println("Km: " + miles * 1.609);
                        break;
                }
                break;
            case 2:
                System.out.println("---------Press 1 for Gram to Ounces Conversions-------");
                System.out.println("---------Press 2 for Ounces to Grams Conversions------");
                System.out.println("---------Press 3 for Kg to Pounds Conversions---------");
                System.out.println("---------Press 4 for Pound to Kg Conversions----------");

                ansSub = value.nextInt();

                switch (ansSub) {
                    case 1:
                        System.out.println("Gram to Ounces Conversions");
                        double gram = value.nextDouble();
                        System.out.println("Gram: " + gram * 0.035);
                        break;
                    case 2:
                        System.out.println("Ounces to Grams Conversions");
                        double ounces = value.nextDouble();
                        System.out.println("Ounces: " + ounces * 28.35);
                        break;
                    case 3:
                        System.out.println("Kg to Pounds Conversions");
                        double kilogram = value.nextDouble();
                        System.out.println("Pounds: " + kilogram * 2.204);
                        break;
                    case 4:
                        System.out.println("Pound to Kg Conversions");
                        double pounds = value.nextDouble();
                        System.out.println("KiloGram: " + pounds * 0.454);
                        break;
                }
                break;
            case 3:
                System.out.println("---------Press 1 for Ml to FluidOunces Conversions----");
                System.out.println("---------Press 2 for FluidOunces to Ml Conversions----");
                System.out.println("---------Press 3 for Litre to Quarts Conversions------");
                System.out.println("---------Press 4 for Quarts to Litre Conversions------");

                ansSub = value.nextInt();

                switch (ansSub) {
                    case 1:
                        System.out.println("Ml to FluidOunces Conversions");
                        double ml = value.nextDouble();
                        System.out.println("FluidOunces: " + ml * 0.035);
                        break;
                    case 2:
                        System.out.println("FluidOunces to Ml Conversions");
                        double FluidOunces = value.nextDouble();
                        System.out.println("Ml: " + FluidOunces * 28.413);
                        break;
                    case 3:
                        System.out.println("Litre to Quarts Conversions");
                        double litre = value.nextDouble();
                        System.out.println("Quarts: " + litre * 0.878);
                        break;
                    case 4:
                        System.out.println("Quarts to Litre Conversions");
                        double quarts = value.nextDouble();
                        System.out.println("Litre: " + quarts * 1.137);
                        break;
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
        System.out.println("-------------Thank You-------------");
    }
}
