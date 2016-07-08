public class SavingsAccount extends Account{
	
	SavingsAccount(){
	}
	
	SavingsAccount(int id, double balance){
		setId(id);
		setBalance(balance);
	}
	
	@Override
	public void withdraw(double amount) {
		if(getBalance() >= amount)
			super.withdraw(amount);
		else
			System.out.println("Insufficient Funds.");
	}

	
}
