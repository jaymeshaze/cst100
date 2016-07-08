/**
 * 
 */

/**
 * @author Kris
 *
 */
public class Main {

	/**
	 Hints for 10.22: you MUST use a separate file for each class,
	 and you MUST follow exactly the public interface conventions
	 used in the book!  DO NOT make gratuitous changes!
	 I will be testing YOUR class with MY main program. 
	 Test well!!!!
	 
	(Implement the String class) The String class is provided in the Java library.
	Provide your own implementation for the following methods (name the new
	class MyString1):
	public MyString1(char[] chars);
	public char charAt(int index);
	public int length();
	public MyString1 substring(int begin, int end);
	public MyString1 toLowerCase();
	public boolean equals(MyString1 s);
	public static MyString1 valueOf(int i);
	 */
	public static void main(String[] args) {
		char[] c = {'A','z','B','y','C','x'};

		MyString1 s = new MyString1(c);
		MyString1 orig = new MyString1(c);
        
        	// charAt
		if ( s.charAt(0) =='A' && s.charAt(5) == 'x' && orig.equals(s) ) {
			// Say nothing
		} else {
			System.out.println( "charAt fails!" );
			System.out.println( "\torig.equals(s) = " + orig.equals(s) );
			System.out.println( "\ts.charAt(0)  = " + s.charAt(0) );
			System.out.println( "\ts.charAt(5)  = " + s.charAt(5) );
		}
		
		// length
		if ( s.length() == 6 && orig.equals(s) ) {
			// Say nothing
		} else {
			System.out.println( "length fails!" );
			System.out.println( "\torig.equals(s) = " + orig.equals(s) );
			System.out.println( "\ts.length()  = " + s.length() );
		}
		
        	// substring
		MyString1 sub = s.substring(1,4);
		if ( sub.length() == 3 && sub.charAt(0) == 'z' && sub.charAt(1) == 'B' && sub.charAt(2) == 'y' && orig.equals(s) ) {
			// Say nothing
		} else {
			System.out.println( "substring fails!" );
			System.out.println( "\torig.equals(s) = " + orig.equals(s) );
			System.out.println( "\tsub.length()  = " + sub.length() );
			System.out.println( "\tsub.charAt(0)  = " + sub.charAt(0) );
			System.out.println( "\tsub.charAt(1)  = " + sub.charAt(1) );
			System.out.println( "\tsub.charAt(2)  = " + sub.charAt(2) );
		}
        
        	// toLowerCase
		MyString1 lower = s.toLowerCase();
		if ( lower.length() == 6 && lower.charAt(0) == 'a' && lower.charAt(1) == 'z' && lower.charAt(4) == 'c' && orig.equals(s) ) {
			// Say nothing
		} else {
			System.out.println( "toLowerCase fails!" );
			System.out.println( "\torig.equals(s) = " + orig.equals(s) );
			System.out.println( "\tlower.length() = " + lower.length() );
			System.out.println( "\tlower.charAt(0) = " + lower.charAt(0) );
			System.out.println( "\tlower.charAt(1) = " + lower.charAt(1) );
			System.out.println( "\tlower.charAt(4) = " + lower.charAt(4) );
		}
 
        	// equals
		char[] c2 = {'A','z','B','y','C','X'};
		MyString1 s1 =  new MyString1(c);
		MyString1 s2 =  new MyString1(c2);
		if ( orig.equals(orig) && orig.equals(s1) && ! orig.equals(s2) ) {
			// Say nothing
		} else {
			System.out.println( "equals fails!" );
			System.out.println( "\torig.equals(s) = " + orig.equals(s) );
			System.out.println( "\torig.equals(s1) = " + orig.equals(s1) );
			System.out.println( "\torig.equals(s2) = " + orig.equals(s2) );
		}
        
        	// valueOf
		char[] c12 = {'1','2'};
		MyString1 s12 =  new MyString1(c12);
		if ( MyString1.valueOf(12).equals(s12) )  {
			// Say nothing
		} else {
			System.out.println( "valueOf fails!" );
		}

	}

}
