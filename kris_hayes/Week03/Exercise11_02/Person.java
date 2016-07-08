
public class Person {
	private String name;
	private String physicalAddress;
	private String phoneNumber;
	private String emailAddress;
	
	Person(){	
	}
	
	Person(String name, String physicalAddress, String phoneNumber, String emailAddress){
		this.name = name;
		this.physicalAddress = physicalAddress;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public String toString(){
		return ("Name: " + name + ", Address: " + physicalAddress + 
				", Phone number: " + phoneNumber + ", Email: " + emailAddress);
	}
}
