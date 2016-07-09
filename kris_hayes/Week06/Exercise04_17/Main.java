/**
 * 
 */

/**
 * (Days of a month) Write a program that prompts
 * the user to enter a year and the first three letters
 * of a month name (with the first letter in uppercase)
 * and displays the number of days in the month.
 * 
 * Hint – be sure to take leap year into account! 
 * Your program should work for any year from 1752 to 4909. See
 * http://www.history.com/news/6-things-you-may-not-know-about-the-gregorian-calendar
 * for more information!  How many days in September, 1752 in the United States?
 * How many days does February have in 2000?  1900?  2001?  2004?
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
        
        //create variables to be used outside of do-while
        int year;
        String month;
        
        //statement to ensure proper input from user
        do{
        	System.out.print("Enter a year: " );
        	year = input.nextInt();
        
        	System.out.print("Enter the first 3 letters of a month, first letter uppercase (Jan): " );
        	month = input.next();
        	
        	if (getMonthNumber(month) == 0 || (year < 1752 || year > 4909))
        		System.out.println("Invalid input, please try again.");
        	
        }while(getMonthNumber(month) == 0 || (year < 1752 || year > 4909));
        
        //variables to hold logic output
        int monthNumber = getMonthNumber(month);
        int numberOfDays = getNumOfDays(year, monthNumber);
        
        //print answer
        System.out.println(month + " " + year + " has " + numberOfDays + " days.");
	
        input.close();
	}
	
	//convert user month to int
    public static int getMonthNumber(String month) {

        int monthNum;

        switch (month) {
            case "Jan":
                monthNum = 1;
                break;
            case "Feb":
                monthNum = 2;
                break;
            case "Mar":
                monthNum = 3;
                break;
            case "Apr":
                monthNum = 4;
                break;
            case "May":
                monthNum = 5;
                break;
            case "Jun":
                monthNum = 6;
                break;
            case "Jul":
                monthNum = 7;
                break;
            case "Aug":
                monthNum = 8;
                break;
            case "Sep":
                monthNum = 9;
                break;
            case "Oct":
                monthNum = 10;
                break;
            case "Nov":
                monthNum = 11;
                break;
            case "Dec":
                monthNum = 12;
                break;
            default:
            	monthNum = 0;
                break;
        }

        return monthNum;
    }

	//return number of days in a month, using LeapYear logic for Feb
    static int getNumOfDays(int year, int monthNum) {

        switch (monthNum) {
            case 1: monthNum = 31; break;
            case 2: 
            	if (isLeapYear(year) == true)
            		monthNum = 29;
            	else
            		monthNum = 28;
            	break;
            case 3: monthNum = 31; break;
            case 4: monthNum = 30; break;
            case 5: monthNum = 31; break;
            case 6: monthNum = 30; break;
            case 7: monthNum = 31; break;
            case 8: monthNum = 31; break;
            case 9: monthNum = 30; break;
            case 10: monthNum = 31; break;
            case 11: monthNum = 30; break;
            case 12: monthNum = 31; break;
            default: monthNum = 0; break;
        }
        return monthNum;
    }
	
    //determine if leap year - code from book, pg. 97
	public static boolean isLeapYear(int year){
			return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
    
}
