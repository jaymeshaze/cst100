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
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter password: ");
		String newPassword = input.nextLine();
		
		passwordCheck(newPassword);
		
		input.close();

	}
	
	public static void passwordCheck(String password){
		int length = password.length() - 1;
		int charLocation = 0;
		int digitCount = 0;
		
		if (length < 7){
			System.out.println("Password Invalid");
		}else{
			while (charLocation <= length){
				char x = password.charAt(charLocation);
			
				if(Character.isLetterOrDigit(x) == true){
					
					if (Character.isDigit(x) == true){
						digitCount++;
					}
					
					if ((charLocation) == length && digitCount >= 2){
						System.out.println("Password Valid!");
						break;
					}else if ((charLocation) == length && digitCount < 2){
						System.out.println("Password Invalid");
						break;
					}else{
						charLocation++;
					}
				}else{
					System.out.println("Password Invalid");
					break;
				}
			
			}
						
		}

	}

}