/**
 * (Occurrences of a specified character in a string) Write a recursive
 * method that finds the number of occurrences of a specified letter
 * in a string using the following method header:
 * 
 * 	public static int count(String str, char a)
 * 
 * For example, count("Welcome", 'e') returns 2.
 * Write a test program that prompts the user to enter a string and
 * a character, and displays the number of occurrences for the
 * character in the string.
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
        System.out.print("Enter a string: ");
        String str = input.next();
        
        //prompt user for input
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        
        //call method to count occurrences within print statement
        System.out.println(count(str, ch));

	}
	
	//method to count occurrences of char in a String
	public static int count(String str, char a){
		
		if (a == str.charAt(0))
			occurrence++;
		
		if (str.length() == 1)
			return occurrence;
		else
			return count(str.substring(1), a);
	}

}
