public abstract class MyAbstractList<E> implements MyList<E> {
	protected int size = 0; // The size of the list
	
	/** Create a default list */
	protected MyAbstractList() {
	}
	
	/** Create a list from an array of objects */
	protected MyAbstractList(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			add(objects[i]);
	}
	
	@Override /** Add a new element at the end of this list */
	public void add(E e) {
		add(size, e);
	}
	
	@Override /** Return true if this list doesn't contain any elements */
	public boolean isEmpty() {
		return size == 0;
	}
	
	@Override /** Return the number of elements in this list */
	public int size() {
		return size;
	}
	
	@Override /** Remove the first occurrence of the element e
	* from this list. Shift any subsequent elements to the left.
	* Return true if the element is removed. */
	public boolean remove(E e) {
		if (indexOf(e) >= 0) {
			remove(indexOf(e));
			return true;
		}
		else
			return false;
	}
	
	 //Adds the elements in otherList to this list.
	 //Returns true if this list changed as a result of the call
	 public boolean addAll(MyList<E> otherList){
		 int currentSize = size;
		 for(int i = 0; i < otherList.size(); i++)
			 this.add(otherList.get(i));
		 return currentSize != size;
	 }
	 
	 //Removes all the elements in otherList from this list
	 //Returns true if this list changed as a result of the call
	 public boolean removeAll(MyList<E> otherList){
		 int currentSize = size;
		 for(int i = 0; i < otherList.size(); i++)
			 if(this.contains(otherList.get(i)))
				 this.remove(otherList.get(i));
		 return currentSize != size;
	 }
	 
	 //Retains the elements in this list that are also in otherList
	 //Returns true if this list changed as a result of the call
	 public boolean retainAll(MyList<E> otherList){
		 int currentSize = size;
		 for(int i = 0; i < this.size(); i++)
			 if(!otherList.contains(this.get(i)))
				 this.remove(this.get(i));
		 return currentSize != size;
	 }
	
}