/**
 * 
 */

/**
 * @author Kris
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// calculate average speed in mph
		
		double kilometers = 14;
		double minutes = 45;
		double seconds = 30;
		
		double miles;
		double totalSeconds;
		double hour;
		double speed;
		
		miles = kilometers / 1.6;
		
		totalSeconds = (minutes * 60) + seconds; //convert time to seconds
		hour = totalSeconds / 3600; //convert seconds to hours
		
		speed = miles / hour; //average mph
		
		System.out.printf("The average speed is: %4.2f", speed);
		
	}

}
