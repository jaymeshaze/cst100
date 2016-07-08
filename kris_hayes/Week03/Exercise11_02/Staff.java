
public class Staff extends Employee{
	private String title;
	
	Staff(){
	}
	
	Staff(String name, String title){
		setName(name);
		this.title = title;
	}
	
	
	
	public String toString(){
//		return ("Class name is " + this.getClass().getSimpleName() + " and person's name is " + getName());
		return ("Class name: " + this.getClass().getSimpleName() + "\nName: " + super.getName()) + (", Title: " + title);
	}

}
