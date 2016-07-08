
public class Faculty extends Employee{
	private String officeHours;
	private String rank;
	
	
	Faculty(){
	}
	
	Faculty(String name, String officeHours, String rank){
		setName(name);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	
	
	
	public String toString(){
//		return ("Class name is " + this.getClass().getSimpleName() + " and person's name is " + getName());
		return ("Class name: " + this.getClass().getSimpleName() + "\nName: " + super.getName()) + (", Office Hours: " + officeHours + ", Rank: " + rank);
	}
}
