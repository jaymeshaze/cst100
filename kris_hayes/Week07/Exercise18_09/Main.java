/**
 * (Print the characters in a string reversely) Write a recursive method
 * that displays a string reversely on the console using the
 * following header:
 * 		public static void reverseDisplay(String value)
 * 
 * For example, reverseDisplay("abcd") displays dcba.
 * 
 * Write a test program that prompts the user to enter a string
 * and displays its reversal.
 * 
 * Hint 18.9: This exercise requires you to write a recursive
 * function (don’t cheat by using the String Reverse method).
 * 
 * @author Kris
 * @version 1.0
 * @since 07-13-2016
 *
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		System.out.print("Enter a string: ");
		String value = input.nextLine();
		
		//method to reverse and print user input
		reverseDisplay(value);

	}
	//recursive method to reverse a string, uses substring
	public static void reverseDisplay(String value){
		if(value.length() == 1)
			System.out.println(value);
		else{
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
		}
	}

}
