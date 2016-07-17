/**
 * (Occurrences of a specified character in a string) Rewrite
 * Programming Exercise 18.10 using a helper method to pass the
 * substring high index to the method. The helper method header is:
 * 
 * 	public static int count(String str, char a, int high)
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
        System.out.println("The number of occurrences of '" + ch + "' in \"" + str + "\" is " + count(str, ch) + ".");

	}
	//recursive method to count occurrences within a String
	public static int count(String str, char a){
		return count(str, a, str.length() - 1);
	}
	
	//helper method for count(String, char)
	public static int count(String str, char a, int high){
		if (a == str.charAt(high))
			occurrence++;
		
		if (high == 0)
			return occurrence;
		else
			return count(str, a, high - 1);
	}

}
