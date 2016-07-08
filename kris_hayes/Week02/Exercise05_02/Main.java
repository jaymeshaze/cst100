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
		// pg 214
		final int NUMBER_OF_QUESTIONS = 10; // number of questions
		int correctCount = 0; // count the number of correct answers
		int count = 0; // count the number of questions
		long startTime = System.currentTimeMillis();
		String output = " "; //output string is initially empty
		Scanner input = new Scanner(System.in);
		
		while (count < NUMBER_OF_QUESTIONS) {
			//Generate two random single-digit integers
			int number1 = (int)(Math.random() * 16);
			int number2 = (int)(Math.random() * 16);
			
			/*	unnecessary for addition problems, needed for subtraction
			//If number1<number 2, swap number1 with number2
			if (number1 < number2){
				int temp = number1;
				number1 = number2;
				number2 = temp;
			}
			*/
			
			//Prompt the student to answer "What is number1 - number2?"
			System.out.print("What is " + number1 + " + " + number2 + "?");
			int answer = input.nextInt();
			
			//Grade the answer and display the result
			if (number1 + number2 == answer){
				System.out.println("You are correct!");
				correctCount++; //increase the correct answer count
			}
			else
				System.out.println("Your answer is wrong.\n" + number1
						+ " + " + number2 + " should be " + (number1 + number2));
			
			//increase the question count
			count++;
			
			output += "\n" + number1 + "+" + number2 + "=" + answer +
					((number1 + number2 == answer) ? " correct" : " wrong");
		}
		
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("\nCorrect count is " + correctCount + 
				"\nTest time is " + testTime / 1000 + " seconds \n" + output);
	
		input.close();
	}

}
