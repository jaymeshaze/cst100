import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Kris
 *
 */
public class Main {

	/**
	For 11.8, use 9.7 from another student (as provided by the instructor).
	 */
	public static void main(String[] args) {
        
		Account.setAnnualInterestRate (1.5);

        Account account = new Account("George", 1122, 1000);
        
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw (5);
        account.withdraw (4);
        account.withdraw (2);
        
        System.out.println ("Name: " + account.getName());
        System.out.println ("Annual Interest Rate: " + account.getAnnualInterestRate() + "%");
        System.out.println ("Balance: " + account.getBalance());
        
        ArrayList list = account.getTransaction();

        System.out.printf("%-35s%-15s%-15s%-15s\n", "Date", "Type", "Amount", "Balance");

        for (int i = 0; i < list.size(); i++){
            Transaction transaction = (Transaction) (list.get(i));
            System.out.printf("%-35s%-15s$%-15s$%-15s\n", transaction.getDate(), transaction.getType(), transaction.getAmount(), transaction.getBalance());
        }
    }
}

