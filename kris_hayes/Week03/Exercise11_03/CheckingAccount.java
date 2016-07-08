public class CheckingAccount extends Account {

	
	CheckingAccount(){
	}
	
	CheckingAccount(int id, double balance){
		setId(id);
		setBalance(balance);
	}
	
	public void withdraw(double amount) {
		if(getBalance() >= amount)
			setBalance(getBalance() - amount);
		else
			System.out.println("Insufficient Funds.");
	}


}
