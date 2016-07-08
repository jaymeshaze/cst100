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
		
		System.out.println("Please enter the weight (in pounds) of your package: ");
		double weight = input.nextDouble();
		double cost;
		
		if (weight > 0 && weight <= 1){
			cost = 3.5;
			System.out.printf("The cost of shipping is $%4.2f", cost);
		}
		else if (weight > 1 && weight <= 3){
			cost = 5.5;
			System.out.printf("The cost of shipping is $%4.2f", cost);
		}
		else if (weight > 3 && weight <= 10){
			cost = 8.5;
			System.out.printf("The cost of shipping is $%4.2f", cost);
		}
		else if (weight > 10 && weight <= 20){
			cost = 10.5;
			System.out.printf("The cost of shipping is $%4.2f", cost);
		}
		else{
			System.out.println("This package cannot be shipped.");
		}
		
		input.close();
	}

}
