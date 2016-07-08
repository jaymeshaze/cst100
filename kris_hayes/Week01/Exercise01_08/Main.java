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
		//area and perimeter of a circle with radius of 5.5
		double radius;
		double perimeter;
		double area;
		
		radius = 5.5;
		
		perimeter = 2 * radius * Math.PI;
		area = radius * radius * Math.PI;
		
		System.out.printf("Perimeter is : %4.2f\n", perimeter);
		System.out.printf("Area is: %4.2f\n", area);

	}

}
