/**
 * 
 */

/**
 * (Palindrome integer) Write the methods with the following headers
 * 
 * 		// Return the reversal of an integer, i.e., reverse(456) returns 654
 * 		public static int reverse(int number)
 * 
 * 		// Return true if number is a palindrome
 * 		public static boolean isPalindrome(int number)
 * 
 * Use the reverse method to implement isPalindrome. A number is
 * a palindrome if its reversal is the same as itself. Write a
 * test program that prompts the user to enter an integer and
 * reports whether the integer is a palindrome.
 * 
 * Hint: Your program should work for ANY non-negative integer.
 * Test carefully!
 * 
 * @author Kris
 * @version 1.0
 * @since 07-04-2016
 *
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user for an int
		System.out.print("Please enter an integer: ");
		int number = input.nextInt();
		//check int with method
		if (isPalindrome(number) == true)
			System.out.print(number + " is a palindrome.");
		else
			System.out.print(number + " is not a palindrome.");
		
		input.close();
	}
	
	public static boolean isPalindrome(int number){
		if(number == reverse(number))
			return true;
		else
			return false;
	}
	//method to reverse number 1 char at a time with loop
	public static int reverse(int number){
		int reverseNum = 0;
	    for(int i = number; i != 0; i /= 10) {
	    	reverseNum = reverseNum * 10 + i % 10;
	    }
	    return reverseNum;
	}

}
