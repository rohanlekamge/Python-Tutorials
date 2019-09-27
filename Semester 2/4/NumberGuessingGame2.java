import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame2 {
    public static void main(String[] args) {
        System.out.println("Guess the number between 1 and 100! \n");
        int guessCounter = 1;
        int number;
        int answer;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        number = rand.nextInt(101);
        while (true) {
            System.out.print("Enter Your Guess: ");
            answer = input.nextInt();
            if (answer < number) {
                System.out.println("Too Low!");
            }
            else if (answer > number) {
                System.out.println("Too High!");
            }
            else {
                System.out.println(answer + " is " + "Correct, You Win! ");
                System.out.println("You Got it in " + guessCounter + " Guesses.");
                break;
            }
            ++guessCounter;
        }
    }
}
