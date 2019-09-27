import java.text.NumberFormat;

public class Round13 {
	public static void main(String[] args) {

		double number = 1234567.456;
    		double roundOff = Math.round(number * 10) / 10.00;
		
		System.out.println(NumberFormat.getNumberInstance().format(roundOff));
	}
}