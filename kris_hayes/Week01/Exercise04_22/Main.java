/**
 * 
 */

/**
 * @author Kris
 *(Check substring) Write a program that prompts the user to enter two strings and
	reports whether the second string is a substring of the first string.
 */
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string s1: ");
		String s1 = input.nextLine();
		
		System.out.println("Enter string s2: ");
		String s2 = input.nextLine();
		
		int k = s1.indexOf(s2);
		
		if (k >= 0){
			System.out.println("The string " + s2 + " is a substring of the string " + s1);
		} else {
			System.out.println("The string " + s2 + " is not a substring of the string " + s1);
		}
		
		input.close();
	}

}
