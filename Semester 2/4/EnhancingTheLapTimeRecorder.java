import java.util.Scanner;

public class EnhancingTheLapTimeRecorder {
    public static void main(String args[]) {
        double min = 9999;
        double max = 0;
        double total = 0;
        Scanner input = new Scanner(System.in);
        int laps=0;

        do {
            System.out.print("Enter the Lap Time " + laps + " (\"x\" to end): ");
            Double lapTime = input.nextDouble();
            total = total + lapTime;
            ++laps;
            if (lapTime < min) {
                min = lapTime;
            }
            if (lapTime > max) {
                max = lapTime;
            }
        } while (input.hasNextDouble());
        System.out.println("Fastest Lap Time: " + max);
        System.out.println("Slowest Lap Time: " + min);
        System.out.println("Average: " + (total/laps));

    }
}
