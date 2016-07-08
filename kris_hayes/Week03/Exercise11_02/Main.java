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
	
//	(The Person, Student, Employee, Faculty, and Staff classes) Design a
//	class named Person and its two subclasses named Student and Employee.
//	Make Faculty and Staff subclasses of Employee.
	
//	A person has a name, address, phone number, and email address.
//	A student has a class status (freshman,sophomore, junior, or senior).
//	Define the status as a constant.
//	An employee has an office, salary, and date hired. Use the MyDate class defined in Programming
//	Exercise 10.14 to create an object for date hired.
//	A faculty member has office hours and a rank.
//	A staff member has a title.\

//	Override the toString method in each class to display the class name and the person’s name.

//	Write a test program that creates a Person, Student, Employee, Faculty, and Staff, and
//	invokes their toString() methods.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("person", "123 Main St.", "334-543-5764", "person@person.com");
        Student student = new Student("student", "Freshman");
        Employee employee = new Employee("employee", "COB 230-1", 15000.50);
        Faculty faculty = new Faculty("faculty", "Mon-Fri 8am-5pm", "Adjunct");
        Staff staff = new Staff("staff", "CEO");
		

		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());
	}

}
