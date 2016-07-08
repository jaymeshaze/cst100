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
		
		System.out.println("Enter an integer: ");
		int number1 = input.nextInt();
		
		System.out.println("Is " + number1 + " divisible by 5 and 6? " + (number1 % 5 == 0 && number1 % 6 == 0));
		System.out.println("Is " + number1 + " divisible by 5 or 6? " + (number1 % 5 == 0 || number1 % 6 == 0));
		System.out.println("Is " + number1 + " divisible by 5 or 6, but not both? " + (number1 % 5 == 0 ^ number1 % 6 == 0));

		input.close();
	}

}
