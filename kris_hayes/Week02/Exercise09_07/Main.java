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
	public static void main(String[] args) {
		Account newAccount = new Account(1122, 20000);
		
		newAccount.setAnnualInterestRate(4.5);
		//print starting balance
		System.out.printf("Starting balance is $%4.2f.\n", newAccount.getBalance());
		
		//withdraw $2500 and print new balance
		newAccount.withdraw(2500);
		System.out.printf("Withdrew $2500, your new balance is $%4.2f.\n", newAccount.getBalance());
		
		//deposit $3000 and print new balance
		newAccount.deposit(3000);
		System.out.printf("Deposited $3000, your new balance is $%4.2f.\n", newAccount.getBalance());
		
		//print monthly interest
		System.out.printf("Your monthly interest amount is $%4.2f.\n", newAccount.getMonthlyInterest());
		
		//print date created
		System.out.printf("This account was created %s.", newAccount.getDateCreated().toString());
	}

}

class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;
	
	Account(){
	}
	
	Account(int startingId, double startingBalance){
		id = startingId;
		balance = startingBalance;
		dateCreated = new java.util.Date();
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int newId){
		id = newId;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBlanace(double newBalance){
		balance = newBalance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newInterestRate){
		annualInterestRate = newInterestRate;
	}

	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		double monthlyInterestRate = ((annualInterestRate / 100) / 12) * 100;
		return monthlyInterestRate;
	}
	
	public double getMonthlyInterest(){
		double monthlyInterest = balance * ((annualInterestRate / 100) / 12);
		return monthlyInterest;
	}
	
	public void withdraw(double withdrawAmount){
		balance -= withdrawAmount;
	}
	
	public void deposit(double depositAmount){
		balance += depositAmount;
	}
}