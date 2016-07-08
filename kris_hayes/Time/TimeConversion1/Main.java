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
		//create user input
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter an hour in 24-hour format
		System.out.print("Enter an hour in 24-hour time format: ");
		int newHour = input.nextInt();
		
		//check user input is in valid range
		boolean validHour = checkHour(newHour);
		
		//if valid, print out conversion based on is user input was <12 or >=12
		if (validHour == true){
			if (newHour > 0 && newHour < 12){
				System.out.print("That is " + newHour + postModifier(newHour) + " in 12-hour format.");
			}else if (newHour == 0){
				System.out.print("That is " + (newHour + 12) + postModifier(newHour) + " in 12-hour format.");
			}else if (newHour == 12){
				System.out.print("That is " + (newHour) + postModifier(newHour) + " in 12-hour format.");
			}else{
				System.out.print("That is " + (newHour - 12) + postModifier(newHour) + " in 12-hour format.");
			}
		//if not valid, print invalid		
		}else{
			System.out.print("Invalid entry");
		}
		
	input.close();
	}

	//method to check user input is in valid range of 24-hour format
	public static boolean checkHour(int hour){
		if (hour >= 0 && hour <= 23)
			return true;
		else
			return false;
	}
	//method to assign correct modifier for 12-hour format
	public static String postModifier(int hour){
		if (hour < 12)
			return "am";
		else
			return "pm";
	}
		
	
}
