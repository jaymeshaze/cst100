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
		// Title
		System.out.println("Numbers divisible by 5 or 6, but not both");
		System.out.println("—————————————————————————————————————————");

		int counter = 0; //counter for line breaks
		
		
		for (int i = 100; i <= 200; i++){
			
			//check to see if i is divisible by 5 or 6
			if (i % 5 == 0 ^ i % 6 == 0){
				System.out.printf("%4d", i);
				counter++;
				
				//return to new line after 10
				if (counter % 10 == 0){
				System.out.print("\n");
				}
			
			}
			
		}

	}
	
}
