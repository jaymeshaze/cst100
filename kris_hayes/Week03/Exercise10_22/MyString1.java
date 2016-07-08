
public class MyString1 {
	char[] c = new char[0];
	
	
	MyString1(char[] chars){
		c = chars;
	}
	
	public char charAt(int index){
		return c[index];
	}
	
	public int length(){
		return c.length;
	}
	
	public MyString1 substring(int begin, int end){
		char[] subC = new char[end-begin];
		for (int i = 0; i <= subC.length - 1; i++) {
			subC[i] = c[begin + i];
		}
		return new MyString1(subC);
	}
	
	public MyString1 toLowerCase(){
		for (int i = 0; i < c.length; i++){
		c[i] = Character.toLowerCase(c[i]);
		}
		return this;
	}
	
	public boolean equals(MyString1 s){
		for(int i = 0; i < c.length; i++) { 
			if(this.charAt(i) != s.charAt(i)) { 
				return false; 
			} 
		}
		return true;
	}

	public static MyString1 valueOf(int i){
		
		String stringC = String.valueOf(i);
		char[] valueC = stringC.toCharArray();
		
		return new MyString1(valueC);
	}
	
}
