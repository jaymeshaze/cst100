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
		// TODO Auto-generated method stub
		//math.round((userInput * 60)) - (math.floor(userInput)*60) = minutes
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount of time in decimal format: ");
		double newTime = input.nextDouble();
		
		Time t = new Time(newTime);
		
		t.convertFromDecimal();
		t.printTime();
	
	input.close();
	}
	
}
