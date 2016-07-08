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
		
		char x = '1';
		char y = 90;
		int perLine = 10;
		
		printChars(x, y, perLine);

	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine){
		int counter = 0;
		
		while (ch1 <= ch2){
			System.out.printf("%2c", ch1);
			ch1++;
			counter++;
			
			if (counter % 10 == 0){
				System.out.print("\n");
			}
			
		}
		
	}

}
