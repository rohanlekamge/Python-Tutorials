import java.util.Scanner;

public class Round12 {
	public static void main(String[] args) {
		Scanner numeric = new Scanner(System.in);
		Double number = numeric.nextDouble();

		double roundOff = Math.round(number * 100.0) / 100.0;
		System.out.println(roundOff);
	}
}