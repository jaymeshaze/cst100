/**
 * 
 */

/**
 * @author Kris
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
//		(Algebra: perfect square) Write a program that prompts the user to enter an integer
//		m and find the smallest integer n such that m * n is a perfect square. (Hint:
//		Store all smallest factors of m into an array list. n is the product of the factors that
//		appear an odd number of times in the array list. For example, consider m = 90,
//		store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
//		in the array list. So, n is 10.)
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer m: ");
		int m = input.nextInt();
		ArrayList<Integer> factors = new ArrayList<>();

		getFactors(m, factors);
		removeDuplicates(factors);
		
        System.out.print("The smallest number n for m* n to be a perfect square is " + smallestSquare(factors) + "\n");
        System.out.print("m * n is " + (m * smallestSquare(factors)));
	}

	
	private static void getFactors(int m, ArrayList<Integer> factors) {

        int count = 2;
        while (count <= m) {
            if (m % count == 0) {
                factors.add(count);
                m /= count;
            } else {
                count++;
            }
        }
	
	}
	
	static ArrayList<Integer> removeDuplicates(ArrayList<Integer> factors) {

			for(int i = 0; i < factors.size()-1; i++){
				for(int j = 1; j < factors.size()-1; j++){
					if(factors.get(i) == factors.get(j)){
						factors.remove(j);
						factors.remove(i);
						break;
					}
				}
			}
		return factors;
		
	}
	
	public static int smallestSquare(ArrayList<Integer> factors){
        int smallestSquare = 1;
        for (int i = 0; i < factors.size(); i++){
            smallestSquare *= factors.get(i);
        }
        return smallestSquare;
	}
	
}