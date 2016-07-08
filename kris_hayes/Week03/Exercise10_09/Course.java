public class Course {
	private String courseName;
	private String[] students = new String[1];
	private int numberOfStudents;
	
	public Course(String courseName) {
	this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		if(numberOfStudents < students.length){	
			students[numberOfStudents] = student;
			numberOfStudents++;
		} else {
			String[] tempStudents = new String[students.length + 1];
			for (int i = 0; i < students.length; i++) {
				tempStudents[i] = students[i];
			}	
			students = tempStudents;
			students[numberOfStudents] = student;
			numberOfStudents++;	
		}
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
		String[] tempStudents = new String[numberOfStudents];
		
		for(int i = 0; i < students.length; i++) {
			if(!students[i].equals(student)) {
				tempStudents[i] = students[i];
			}else{
				numberOfStudents--;
			}
		 }
		
		students = tempStudents;
	}
		
	public void clear(){
		for (int i = 0; i < students.length; i++) {
			students[i] = null;
			numberOfStudents = 0;
		}
	}

	public static void printArray(String[] anArray) {
		for (int i = 0; i < anArray.length; i++) {
	         if (i > 0) {
	            System.out.print(", ");
	         }
	         
	         System.out.print(anArray[i]);
	   }
	}
}

