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
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter point 1 (latitude and longitude) in degrees, " +
	"seperated by a space, such as 'x1 y1': ");
	double x1 = input.nextDouble();
	double y1 = input.nextDouble();
	
	System.out.println("Enter point 2 (latitude and longitude) in degrees, " +
	"seperated by a space, such as 'x2 y2': ");
	double x2 = input.nextDouble();
	double y2 = input.nextDouble();
	
	final double EARTH_RADIUS = 6371.01;
	
	//convert degrees to radians
	x1 = Math.toRadians(x1);
	x2 = Math.toRadians(x2);
	y1 = Math.toRadians(y1);
	y2 = Math.toRadians(y2);
	
	double distance = EARTH_RADIUS * Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2)) * Math.cos(y1 - y2));
	
	System.out.println("The distance between the two points is " + distance + " km");
	
	input.close();
	}

}
