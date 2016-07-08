/**
 * 
 */

/**
 * @author Kris
 * @version 1.0
 * @since 06-21-2016
 */
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{
	int side;
	
	
	Octagon(){
	}
	
	Octagon(int side){
		this.side = side;		
	}
	
	public double getArea(){
		double area = ((2 * (1 + Math.sqrt(2))) * (side * side));
		return area;
	}
	
	public double getPerimeter(){
		double perimeter = side * 8;
		return perimeter;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public int compareTo(Octagon o){
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
}

