import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame1 {
    public static void main(String[] args) {
        System.out.println("Guess the number between 1 and 100! \n");
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int guessCounter = 1;
        int number;
        int answer;
        number = rand.nextInt(101);
        do {
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
            }
            ++guessCounter;
        } while (number != answer );
    }
}
