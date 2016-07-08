import java.util.Date;

public class Transaction {
	private Date transactionDate;
	private char type;
	private double amount;
	private double balance;
	private String description;
	
	Transaction(){
	}
	
	Transaction(char type, double amount, double balance, String description){
		transactionDate = new java.util.Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
	   
	public java.util.Date getDate(){
	    return transactionDate;
	}

	public char getType(){
	    return type;
	}

	public double getAmount(){
	    return amount;
	}

	public double getBalance(){
	    return balance;
	}

	public String getDescription(){
	    return description;
	}
}
