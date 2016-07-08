/**
 * 
 */

/**
 * @author Kris
 *
 */
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//request number of pounds
		System.out.print("Enter a number in pounds: ");
		double pounds = input.nextDouble();
		
		//converts pounds to kilograms using conversion rate
		double kilograms = pounds * 0.454;
		
		System.out.printf("%4.0f pounds is %4.2f kilograms", pounds, kilograms);
		
		input.close();
		
	}

}
