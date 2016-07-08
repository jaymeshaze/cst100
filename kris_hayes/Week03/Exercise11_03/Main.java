/**
 * 
 */

/**
 * @author Kris
 *
 */
public class Main {

	/**
	For 11.3, use 9.7 from another student (as provided by the instructor).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account(1, 1000.00);
		CheckingAccount checking = new CheckingAccount(2, 5000.00);
		SavingsAccount savings = new SavingsAccount(3, 250.00);
		
		Account.setAnnualInterestRate(1.0);
		
		System.out.println(account.toString());
		System.out.println(checking.toString());
		System.out.println(savings.toString());
	}

}
