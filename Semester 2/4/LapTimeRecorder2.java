import java.util.Scanner;

public class LapTimeRecorder2 {
    public static void main(String[] args) {
        int min = 9999;
        int max = 0;
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Laps: ");
        int laps = input.nextInt();
        int[] lapTimes = new int[laps];

        for (int i=0; i<laps; ++i) {
            System.out.print("Enter the Lap Time: ");
            int lapTime = input.nextInt();
            lapTimes[i] = lapTime;

            if (lapTimes[i] > max) {
                max = lapTimes[i];
            }
            if (lapTimes[i] < min) {
                min = lapTimes[i];
            }
            total = total + lapTimes[i];
        }

        System.out.println("Fastest Lap Time: " + max);
        System.out.println("Slowest Lap Time: " + min);
        System.out.println("Average: " + (total/laps));
    }
}
