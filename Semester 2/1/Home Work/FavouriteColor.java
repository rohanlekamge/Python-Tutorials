import java.util.Scanner;

public class FavouriteColor {
    public static void main(String[] args) {
        Scanner color = new Scanner(System.in);
        System.out.println("Enter Your Favourite Color: ");

        String favColor = color.nextLine();
        System.out.println("Your Favourite Color is: " + favColor);

    }
}
