import java.util.Random;

public class SimpleLoopingProgram {
    public static void main(String[] args) {
        int number;
        Random rand = new Random();
        int count = 1;
        do {
            number = rand.nextInt(11);
            System.out.println("Number " + count + " was " + number);
            if (number == 7)
                System.out.println("Lucky 7! ");
            ++count;
        } while (number != 0);
    }
}
