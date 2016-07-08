
public class Student extends Person{
	private String classStatus;
	
	Student(){
	}
	
	Student(String name, String classStatus){	
		setName(name);
		this.classStatus = classStatus;
	}
	
	public String toString(){
//			return ("Class name is " + this.getClass().getSimpleName() + " and person's name is " + getName());
		return("Class name: " + this.getClass().getSimpleName() + "\nName: " + super.getName()) + (", Class status is " + classStatus);
	}
}
