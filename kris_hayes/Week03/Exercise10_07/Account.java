
public class Account {
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

