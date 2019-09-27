import java.util.Scanner;

public class LapTimeRecorder1 {
    public static void main(String[] args) {
        int total = 0;
        int fastest = 0;
        int slowest = 9999;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Laps: ");
        int laps = input.nextInt();
        for (int i=0; i<laps; ++i) {
            System.out.print("Enter the Lap Time: ");
            int lapTime = input.nextInt();
            if (lapTime < slowest) {
                slowest = lapTime;
            }
            else if (lapTime > fastest) {
                fastest = lapTime;
            }
            total = total + lapTime;
        }
        System.out.println("Fastest Lap Time: " + fastest);
        System.out.println("Slowest Lap Time: " + slowest);
        System.out.println("Average: " + (total/laps));
    }
}
