/**
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
 *
 * 		Creates an array with 100 randomly chosen integers.
 * 		Prompts the user to enter the index of the array,
 * 			then displays the corresponding element value.
 * 		If the specified index is out of bounds, display the message "Out of Bounds."
 * 
 * @author Kris
 * @version 1.0
 * @since 06-21-2016
 */
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Create an array with 100 random integers
		int[] numArray = new int[100];
		for (int i = 0; i < numArray.length - 1; i++){
			numArray[i] = (int)(Math.random() * 100);
		}
		
		// Prompt the user pick an index number
		System.out.print("Enter an index number between 0-99 to display the number: ");
		int userChoice = input.nextInt();
		
		//attempt to retrieve that number using a method; throw an exception if out of range
		try {
			int result = name(numArray, userChoice);
			System.out.print("That number is: " + result);
		}
		catch (IndexOutOfBoundsException ex){
			System.out.println("Exception: Out of Bounds.");
		}
		
		input.close();

	}
	//method to process exception if out of range, or return appropriate index
	public static int name(int[] numArray, int userChoice){
		if (userChoice > numArray.length-1)
			throw new IndexOutOfBoundsException("Number is out of range");
		return numArray[userChoice];
	}
}
