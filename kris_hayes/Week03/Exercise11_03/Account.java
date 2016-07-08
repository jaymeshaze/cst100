import java.util.Date;

/**
 * The Acount class itself.
 * The test program is normally in a separate file from the class being tested.
 *
 * Note the use of Javadoc annotations.
 * http://www.oracle.com/technetwork/articles/java/index-137868.html
 *
 * @author Orville Weyrich
 */

class Account {
	private int id;
	private double balance;
	private Date dateCreated; 

	// Note that we can choose to store the annual interest rate as either the percent (e.g. 12)
	// or the fractional equivalent (e.g. 0.12).  Our getters and setters can make conversion
	// to/from whatever we choose as our internal represenation.
	//
	// The book says that the interest rate manipulated by the getters and setters is a percent (e.g. 12%).
	// We will STORE this as the fraction, e.g. 0.12%.
	//
	// The book says that ALL accounts have the same interest rate.  
	// This implies that the interest rate is a static variable, and can be updated and fetched
	// by static methods.
	private static double annualInterestRate;

		 
// Constructors to initialize new object instances.

	/**
	 * Parameterless constructor for Acount objects
	 *
	 * Parameterless constructor must be defined since Java does not create
	 * a default constructor if there are other constructors defined.
	 */
	Account () {
		id = 0;
		balance = 0;
		dateCreated = new java.util.Date();
		// We do NOT initialize the annualInterestRate, because as a
		// static variable, it starts at 0 automatically, but may be changed.
	}
		
	/**
	 * Constructor for Acount objects that initializes account id and balance.
	 *
	 * @param id acount number
	 * @param balance initial balance of account
	 */
	Account (int id, double balance) {
		this(); // invoke parameterless constructor to initialize dateCreated.
		this.id = id;
		this.balance = balance;
	}
		
// Accessors (getter methods) to obtain current attribute values

	/**
	 * Gets the account number (id) of this Account object instance.
	 *
	 * @return this account number
	 */
	public int getId() {
		return id;  
	}

	/**
	 * Gets the account balance of this Account object instance.
	 *
	 * @return this account balance
	 */
	public double getBalance() {
		return balance;  
	}

	/**
	 * Gets the annual percent interest rate of all accounts.
	 *
	 * @return annual interest rate of all accounts, in percent.
	 */
	public static double getAnnualInterestRate() {
		// Convert from internal fractional representation to external representation.
		return annualInterestRate * 100.00;  
	}

	/**
	 * Gets the amount of monthly percent interest on the current account balance.
	 *
	 * @return this account monthly interest, in dollars
	 */
	public double getMonthlyInterest() {
		// Note that our chosen internal representation is the fractional, not percentage form.
		return balance * annualInterestRate / 12.00;
	}

	/**
	 * Gets the date this account instance object was created.
	 *
	 * @return this account creation date.
	 */
	public Date getDateCreated() {
		return dateCreated;
	}


// Mutators (setters) to change the state of this object instance

	/**
	 * Setter method to change the account id number.
	 * It is arguable that we should not allow this public method,
	 * because things get really messy if other objects refer to this
	 * object by it's id number, and we change the id of the account.
	 * But since the book specifies that we have a default constructor,
	 * we need this setter.
	 *
	 * @param id new acount number to replace the original value.
	 */
	public void setId(int id)   {     
		this.id = id;   
	}

	/**
	 * Setter method to change the account balance
	 *
	 * @param balance new account balance.
	 */
	public void setBalance(double balance)   {     
		this.balance = balance;   
	}

	/**
	 * Setter method to change the percent annual interest rate of all accounts.
	 *
	 * @param annualInterestRate new annual percent interest rate of all accounts.
	 */
	public static void setAnnualInterestRate(double percentAnnual) { 
		// convert from extermal percentage to internal fractional rate.    
		annualInterestRate = percentAnnual / 100.00;   
	}

	// We do NOT include a setter method to change the creation date of the account,
	// since there is a single creation event that is initialized by the object constructor.

	/**
	 * Mutator method to change the balance to reflect a withdraw made.
	 * This could return the new balance, but for consistency we will make getters only get
	 * and mutators only mutate.
	 *
	 * @param amount withdraw amount, in dollars.
	 */
	public void withdraw(double amount) {
		balance -= amount;
	}

	/**
	 * Mutator method to change the balance to reflect a deposit made.
	 * This could return the new balance, but for consistency we will make getters only get
	 * and mutators only mutate.
	 *
	 * @param amount deposit amount, in dollars.
	 */
	public void deposit(double amount) {
		balance += amount;
	}
	
	public String toString(){
		return ("ID: " + getId() + ", Balance: " + getBalance() +
				", Annual Interest Rate: " + getAnnualInterestRate() + "%, Date Created: " + getDateCreated());
	}
}