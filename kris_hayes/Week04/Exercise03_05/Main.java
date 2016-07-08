/**
 * 
 */

/**
 * Exercise 3.5:
 * (Find future dates) Write a program that prompts the user to enter an integer
 * for today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6).
 * Also prompt the user to enter the number of days after today for a future day
 * and display the future day of the week.
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
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		//create variables for current and future date
		int currentDayNumber;
		int futureDayNumber;
		String currentDayName = null;
		String futureDayName = null;
		
		//Prompt user to enter an integer for today's day of the week, store in variable
		System.out.print("Enter today's day: ");
		currentDayNumber = input.nextInt();
		
		// Prompt user to enter an integer for the number of days elapsed since today, store in variable
		System.out.print("Enter the number of days elapsed since today: ");
		futureDayNumber = input.nextInt();
		
		//Assign appropriate day name to currentDayName
		switch(currentDayNumber){
			case 0: currentDayName = "Sunday"; break;
			case 1: currentDayName = "Monday"; break;
			case 2: currentDayName = "Tuesday"; break;
			case 3: currentDayName = "Wednesday"; break;
			case 4: currentDayName = "Thursday"; break;
			case 5: currentDayName = "Friday"; break;
			case 6: currentDayName = "Saturday"; break;
		}
		//calculate future day number and assign appropriate day name to futureDayName
		switch((futureDayNumber + currentDayNumber) % 7){
			case 0: futureDayName = "Sunday"; break;
			case 1: futureDayName = "Monday"; break;
			case 2: futureDayName = "Tuesday"; break;
			case 3: futureDayName = "Wednesday"; break;
			case 4: futureDayName = "Thursday"; break;
			case 5: futureDayName = "Friday"; break;
			case 6: futureDayName = "Saturday"; break;
		
		}
		//Print result
		System.out.print("Today is " + currentDayName + " and the future day is " + futureDayName + ".");;

		input.close();
	}

}
