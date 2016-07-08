/**
 * 
 */

/**
 * Exercise 13.11
 * (The Octagon class) Write a class named Octagon that extends GeometricObject
 * and implements the Comparable and Cloneable interfaces.
 * Assume that all eight sides of the octagon are of equal length.
 * The area can be computed using the following formula:
 * 		area = (2 + 4/22)* side * side
 * 
 * Write a test program that creates an Octagon object with
 * side value 5 and displays its area and perimeter.
 * Create a new object using the clone method and compare the
 * two objects using the compareTo method.
 * 
 * @author Kris
 * @version 1.0
 * @since 06-21-2016
 */

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Create 2 Octagons, one with side value of 5
		Octagon geoOctagon1 = new Octagon(5);
		Octagon geoOctagon2 = new Octagon();
		
		//Print properties of Octagon1
		System.out.printf("The area of Octagon 1 is: %4.2f\n", geoOctagon1.getArea());
		System.out.printf("The perimeter of Octagon 1 is: %4.2f\n", geoOctagon1.getPerimeter());
		
		//Clone geoOctagon1 to geoOctagon2
		try {
			geoOctagon2 = (Octagon)geoOctagon1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.print("Object not cloneable.");
		}
		
		//test for geoOctagon2 properties
//		System.out.printf("The area of Octagon 2 is: %4.2f\n", geoOctagon2.getArea());
//		System.out.printf("The perimeter of Octagon 2 is: %4.2f\n", geoOctagon2.getPerimeter());
		
		//compare both octagons
		if (geoOctagon1.compareTo(geoOctagon2) == 0)
			System.out.print("Octagon 1 and Octagon 2 are the same");
		else
			System.out.print("Octagon 1 and Octagon 2 are not the same");

	}

}
