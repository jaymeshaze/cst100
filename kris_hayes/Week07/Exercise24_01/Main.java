/**
 * (Add set operations in MyList) Define the following methods in MyList
 * and implement them in MyAbstractList:
 * //Adds the elements in otherList to this list.
 * //Returns true if this list changed as a result of the call
 * 		public boolean addAll(MyList<E> otherList);
 * 
 * //Removes all the elements in otherList from this list
 * //Returns true if this list changed as a result of the call
 * 		public boolean removeAll(MyList<E> otherList);
 * 
 * //Retains the elements in this list that are also in otherList
 * //Returns true if this list changed as a result of the call
 * 		public boolean retainAll(MyList<E> otherList);
 * 
 * Write a test program that creates two MyArrayLists,
 * list1 and list2, with the initial values
 * {"Tom", "George", "Peter", "Jean", "Jane"} and
 * {"Tom", "George", "Michael", "Michelle", "Daniel"},
 * then perform the following operations:
 *  - Invokes list1.addAll(list2), and displays list1 and list2.
 *  - Recreates list1 and list2 with the same initial values, invokes
 *  	list1.removeAll(list2), and displays list1 and list2.
 *  - Recreates list1 and list2 with the same initial values, invokes
 *  	list1.retainAll(list2), and displays list1 and list2.
 * 
 * Hint: See Listings 24.1 and 24.2 on pages 897-899
 * 
 * @author Kris
 * @version 1.0
 * @since 07-13-2016
 *
 */

public class Main{

	public static void main(String[] args) {
		
		//create an array of names
		String[] listArray1 = {"Tom", "George", "Peter", "Jean", "Jane"};
		String[] listArray2 = {"Tom", "George", "Michael", "Michelle", "Daniel"};
		
		//new ArrayList for names array
		MyArrayList<String> list1 = new MyArrayList(listArray1);
		MyArrayList<String> list2 = new MyArrayList(listArray2);
		
		//add method call, print
		list1.addAll(list2);
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		
		//remake lists
		list1 = new MyArrayList(listArray1);
		list2 = new MyArrayList(listArray2);
		
		//removeall method call, print
		list1.removeAll(list2);
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);
		
		//remake lists
		list1 = new MyArrayList(listArray1);
		list2 = new MyArrayList(listArray2);
		
		//retainall method call, print
		list1.retainAll(list2);
		System.out.println("list1 = " + list1);
		System.out.println("list2 = " + list2);

	}

}
