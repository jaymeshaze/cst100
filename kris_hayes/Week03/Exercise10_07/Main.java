/**
 * 
 */

/**
 * @author Kris
 *
 */
import java.util.Scanner;

public class Main {

	/**
	 Hints for 10.7: Allow overdrafts; Use the Account code
	 in the book and do not make gratuitous changes. 
	 This is an interactive program!  Test it well for
	 normal and error conditions.  Your program should
	 behave reasonably (not crash or give bogus answer)
	 with bad input (e.g. invalid account number,
	 negative deposits or withdraws).
	 */
	public static void main(String[] args) {
		//create an array of 10 account (0-9) with starting balance of $100
		
		Account[] newAccounts = new Account[10];

		for(int i = 0 ; i < newAccounts.length ; i++){
			double balance = 100;
            int id = i;
            newAccounts[i] = new Account(id, balance); 
		}
		
		ATM(newAccounts);

	}
	
	static void ATM(Account a[]){
		
		
		System.out.print("Enter an id:");
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		
		for(int j = 0 ; j < a.length ; j++){
			if(id == a[j].getId() && j < a.length){
				do{
					System.out.println("Main menu:");
					System.out.println("1: check balance");
					System.out.println("2: withdraw");
					System.out.println("3: deposit");
					System.out.println("4: exit");
					System.out.print("Enter a choice:");
					int i = input.nextInt();
					
					switch(i){
						case 1: System.out.printf("The balance is: $%4.2f\n\n", a[j].getBalance());
							break;
						case 2: System.out.print("Enter an amount to withdraw?");
							double withdrawAmount = input.nextDouble();
							a[j].withdraw(withdrawAmount);
							System.out.println();
							break;
						case 3: System.out.print("Enter an amount to deposit?");
							double depositAmount = input.nextDouble();
							a[j].deposit(depositAmount);
							System.out.println();
							break;
						case 4: System.out.print("Enter an id:");
							id = input.nextInt();
							j=0;
							break;
					}
				}while(true);
			}else if( j == a.length-1){
				System.out.println("Wrong ID");
				System.out.print("Enter a valid id:");
				id = input.nextInt();
				j=0;
			}
		}
	input.close();
	}
}