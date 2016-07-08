/**
 * 
 */

/**
 * Exercise 3.2:
 * Game: add three numbers) The program in Listing 3.1,
 * AdditionQuiz.java, generates two integers and prompts
 * the user to enter the sum of these two integers.
 * Revise the program to generate three single-digit integers
 * and prompt the user to enter the sum of these three integers.
 * 
 * @author Kris
 * @version 1.0
 * @since 06-21-2016
 */
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create var to generate random number
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 9 % 10);

		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt user to add the 3 random numbers
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
		int answer = input.nextInt();

		//State the problem and whether true or false
		System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer +
				" is " + (number1 + number2 + number3 == answer));
	
		input.close();
	}

}


