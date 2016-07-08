/**
 * 
 */

/**
 * Exercise 13.16
 * (Create a rational-number calculator) Write a program
 * similar to Listing 7.9, Calculator.java. Instead of using
 * integers, use rationals, as shown in Figure 13.10a.
 * You will need to use the split method in the String class,
 * introduced in Section 10.10.3, Replacing and Splitting Strings,
 * to retrieve the numerator string and denominator string, and
 * convert strings into integers using the Integer.parseInt method.
 * 
 * @author Kris
 * @version 1.0
 * @since 06-21-2016
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] tokens = args[0].split("[\\s]");
		
		String[] rational1 = tokens[0].split("/");
//		for (int i = 0; i < rational1.length; i++)
//			System.out.println(rational1[i]);
		
		long numerator1 = (long)Integer.parseInt(rational1[0]);
		long denominator1 = (long)Integer.parseInt(rational1[1]);
		
		String[] rational2 = tokens[2].split("/");
//		for (int i = 0; i < rational2.length; i++)
//			System.out.println(rational2[i]);
		
		long numerator2 = (long)Integer.parseInt(rational2[0]);
		long denominator2 = (long)Integer.parseInt(rational2[1]);
		
		Rational rationalOne = new Rational(numerator1, denominator1);
		Rational rationalTwo = new Rational(numerator2, denominator2);
		
		Rational rationalResult = new Rational();
		
		switch(tokens[1]){
			case "+": rationalResult = rationalOne.add(rationalTwo);break;
			case "-": rationalResult = rationalOne.subtract(rationalTwo);break;
			case "/": rationalResult = rationalOne.divide(rationalTwo);break;
			case "*": rationalResult = rationalOne.multiply(rationalTwo);break;
		}
		
		System.out.println(rationalOne.toString() + " " + tokens[1] + " " + rationalTwo.toString() + " = " + rationalResult.toString());
	
	}

}
