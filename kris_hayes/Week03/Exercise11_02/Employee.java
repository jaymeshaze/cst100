
public class Employee extends Person{
	private String office;
	private double salary;
	private java.util.Date dateHired;

	Employee(){
	}
	
	Employee(String name, String office, double salary){
		setName(name);
		this.office = office;
		this.salary = salary;
		this.dateHired = new java.util.Date();
	}
	
	public String toString(){
//		return ("Class name is " + this.getClass().getSimpleName() + " and person's name is " + getName());
		return("Class name: " + this.getClass().getSimpleName() + "\nName: " + super.getName()) + (", Office: " + office + ", Salary: " + salary + ", Date Hired: " +
				dateHired);
	}
}
