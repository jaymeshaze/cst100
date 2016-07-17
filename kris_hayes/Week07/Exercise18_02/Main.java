/**
 * (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
 * Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2) 
 * and fib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci numbers.
 * The current Fibonacci number would then be f0 + f1. The algorithm can be
 * described as follows:
 * 
 * f0 = 0; // For fib(0)
 * f1 = 1; // For fib(1)
 * 
 * 	for (int i = 1; i <= n; i++) {
 * 		currentFib = f0 + f1;
 * 		f0 = f1;
 * 		f1 = currentFib;
 * 	}
 * // After the loop, currentFib is fib(n)
 * 
 * Write a test program that prompts the user to enter an index and displays
 * its Fibonacci number.
 * 
 * Hint 18.2:  This exercise requires you to convert a recursive program
 * to one that uses loops instead.
 * 
 * 
 * @author Kris
 * @version 1.0
 * @since 07-13-2016
 *
 */

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		System.out.print("Please enter an index for Fibonacci number: ");
		int n = input.nextInt();
		
		//display result, calling method within print statement
		System.out.println("The Fibonacci number at index " + n + " is " + fib(n) + ".");
		
		input.close();
	}
	//non-recursive method to calculate fib number (used code from text book)
	public static int fib(int n){
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		
		int f0 = 0; // For fib(0)
		int f1 = 1; // For fib(1)
		int currentFib = -1;
		 
		 for (int i = 1; i < n; i++) {
		 	currentFib = f0 + f1;
		 	f0 = f1;
		 	f1 = currentFib;
		 }
		 return currentFib;
		
	}

}
