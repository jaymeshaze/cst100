/**
 * (Use the GenericStack class) Write a program that
 * displays the first 50 prime numbers in descending order.
 * Use a stack to store the prime numbers.
 * 
 * Hint: See Listings 24.1 and 24.2 on pages 897-899
 * 
 * @author Kris
 * @version 1.0
 * @since 07-13-2016
 *
 */

public class Main {

	public static void main(String[] args) {
		//create stacks
		GenericStack<Integer> stack1 = new GenericStack<>();
		GenericStack<Integer> stack2 = new GenericStack<>();
		
		//create 50 prime numbers
		int i = 0;
		
		while(stack1.getSize() < 50){
			if(isPrime(i))
				stack1.push(i);
			i++;
		}
		
		//invert list to reverse order
		int stackSize = stack1.getSize();
		
		for(int j = 0; j < stackSize; j++){
			stack2.push(stack1.pop());
		}
		
		//print results
		System.out.println(stack2.toString());

	}
	
	//method to test if prime number
	public static boolean isPrime(int number){
		int result = 0;
		int j = 2;
		
		if(number == 0)
			result = 1;
		if(number == 1)
			result = 1;
		
		while (j <= number / 2){
			if (number % j == 0){
				result = 1;
			}
			j++;
		}
		if(result == 1)
			return false;
		else
			return true;	
	}

}
