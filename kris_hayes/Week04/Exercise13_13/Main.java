/**
 * 
 */

/**
 * Exercise 13.13
 * (Enable the Course class cloneable) Rewrite the
 * Course class in Listing 10.6 to add a clone method
 * to perform a deep copy on the students field.
 * 
 * MODIFICATION for 13.13:  As written in the text,
 * this program does not have a main method.  In addition to
 * implementing the clone method, create a Main class
 * containing the main method that will do the following:
 * 		Create a Course object named origCourse and add 5 students.
 * 		Create a second Course object named clnCourse that is a clone of origCourse.
 * 		Remove the first, third, and fifth students from Orig.
 * 		Loop over the number of students in origCourse and display
 * 				the remaining students in origCourse (which should be 2).
 * 		Loop over the number of students in clnCourse and display
 * 				the students remaining in clnCourse (which should be 5). 
 * 		You will have to implement the dropStudent method as well.
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
		//create origCourse
		Course origcourse = new Course("Original Course");
		
		//add 6 students to origCourse
		origcourse.addStudent("Tom"); 
		origcourse.addStudent("Dick");
		origcourse.addStudent("Harry");
		origcourse.addStudent("Peter");
		origcourse.addStudent("Paul");
		
		//create clnCourse
		Course clnCourse = new Course("Clone Course");
		
		//clone origCourse to clnCourse
		try {
			clnCourse = (Course)origcourse.clone();
		} catch (CloneNotSupportedException e) {
			System.out.print("Object not cloneable.");
		}

		//remove 1st, 3rd, and 5th student from origCourse
		origcourse.dropStudent("Tom"); 
		origcourse.dropStudent("Harry"); 
		origcourse.dropStudent("Paul");
		
		//loop and print students in origCourse
		for (int i = 0; i < origcourse.getNumberOfStudents() ; i++) {
			System.out.print(origcourse.getStudents()[i] + " ");
		}
		System.out.println();
		
		//loop and print students in clnCourse		
		for (int i = 0; i < clnCourse.getNumberOfStudents() ; i++) {
			System.out.print(clnCourse.getStudents()[i] + " ");
		}
		System.out.println();
		
				
	}

}
