import java.util.ArrayList;
import java.util.Arrays;

public class Course implements Cloneable{
	private String courseName;
	private String[] students = new String[0];
	private int numberOfStudents = 0;
	
	public Course(String courseName) {
	this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		ArrayList<String> listStudents = new ArrayList<String>(Arrays.asList(students));
		listStudents.add(student);
		
		numberOfStudents++;
		
		String[] tempStudents = listStudents.toArray(new String[0]);
		students = tempStudents;
	}
		
	public String[] getStudents() {
	return students;
	}
	
	public int getNumberOfStudents() {
	return numberOfStudents;
	}
	
	public String getCourseName() {
	return courseName;
	}
	
	public void dropStudent(String student) {
		ArrayList<String> listStudents = new ArrayList<String>(Arrays.asList(students));
		listStudents.remove(student);
		
		numberOfStudents--;
		
		String[] tempStudents = listStudents.toArray(new String[0]);
		students = tempStudents;
	}
		
	public void clear(){
		ArrayList<String> listStudents = new ArrayList<String>(Arrays.asList(students));
		listStudents.clear();
		
		numberOfStudents = 0;
		
		String[] tempStudents = listStudents.toArray(new String[0]);
		students = tempStudents;
	}

	public static void printArray(String[] anArray) {
		for (int i = 0; i < anArray.length; i++) {
	         if (i > 0) {
	            System.out.print(", ");
	         }
	         
	         System.out.print(anArray[i]);
	   }
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

