/**
 * Test driver to test Origram 10.9
 * 
 * @author Orville Weyrich
 * 
 */

public class Main {
	public static void main(String[] args) {
    
		// Create the course object
		Course course = new Course("Test Class");

		// Add 6 students and display
		course.addStudent("Tom"); 
		course.addStudent("Dick");
		course.addStudent("Harry");
		course.addStudent("Peter");
		course.addStudent("Paul");
		course.addStudent("Mary");
		System.out.print(course.getCourseName() + " has " + course.getNumberOfStudents() + ": " );
		for (int i = 0; i < course.getNumberOfStudents() ; i++) {
			System.out.print(course.getStudents()[i] + " ");
		}
		System.out.println();

		// Remove 3 student and display remaining 3
		course.dropStudent("Tom"); 
		course.dropStudent("Mary"); 
		course.dropStudent("Harry"); 
		System.out.print(course.getCourseName() + " has " + course.getNumberOfStudents() + ": " );
		for (int i = 0; i < course.getNumberOfStudents() ; i++) {
			System.out.print(course.getStudents()[i] + " ");
		}
		System.out.println();

		// Remove all students and display none
		course.clear(); 
		System.out.print(course.getCourseName() + " has " + course.getNumberOfStudents() + ": " );
		for (int i = 0; i < course.getNumberOfStudents() ; i++) {
			System.out.print(course.getStudents()[i] + " ");
		}
		System.out.println();

		// Add 200 students and print first and last
		for (int i = 0; i < 200; i++ ) {
			course.addStudent("Student" + Integer.toString(i));
		}
		System.out.print(course.getCourseName() + " has " + course.getNumberOfStudents() + ": " );
		System.out.print(course.getStudents()[0] + " ");
		System.out.print(course.getStudents()[199] + " ");
		System.out.println();
	}
}