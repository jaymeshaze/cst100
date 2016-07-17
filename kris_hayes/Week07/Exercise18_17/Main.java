/**
 * (Occurrences of a specified character in an array)
 * Write a recursive method that finds the number of occurrences
 * of a specified character in an array. You need to define the
 * following two methods. The second one is a recursive helper method.
 * 
 * 		public static int count(char[] chars, char ch)
 * 		public static int count(char[] chars, char ch, int high)
 * 
 * Write a test program that prompts the user to enter a list of characters
 * in one line, and a character, and displays the number of occurrences of
 * the character in the list.
 * 
 * Hint 18.10, 18.15, 18.17: Be sure to use the method signatures specified in the book!
 * 
 * @author Kris
 * @version 1.0
 * @since 07-13-2016
 *
 */

import java.util.Scanner;

public class Main {

	//static class variable to hold occurrence count
	static int occurrence = 0;

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //prompt user for input
        System.out.print("Enter a list of characters in one line (no spaces or delimiters): ");
        String str = input.nextLine();
        
        //prompt user for input
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        
        //convert String to individuals chars in an array
        char[] chars = str.toCharArray();
        
        //call method to count occurrrences in an array, within print statement
        System.out.println("The number of occurrences of '" + ch + "' in \"" + str + "\" is " + count(chars, ch) + ".");

	}
	
	//method to count occurrences of char in an array
	public static int count(char[] chars, char ch){
		return count(chars, ch, chars.length - 1);
	}
	
	//helper method to count (char[]. char)
	public static int count(char[] chars, char ch, int high){
		if(ch == chars[high])
			occurrence++;
		
		if(high == 0)
			return occurrence;
		else
			return count(chars, ch, high - 1);
	}

}
