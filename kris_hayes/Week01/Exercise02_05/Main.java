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
		
		//request bill subtotal
		System.out.print("Enter the subtotal of your bill: ");
		double subtotal = input.nextDouble();
		
		//request gratuity rate
		System.out.print("Enter the desired gratuity rate (example 15): ");
		double gratuityRate = input.nextDouble();
		
		//calculate gratuity and total
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;
		
		//display gratuity and total to user
		System.out.printf("The gratuity is $%4.2f and your total is $%4.2f", gratuity, total);
		
		input.close();
		
	}

}
