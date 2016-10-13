/*
 * Class: GeometricObject
 * -color: String
 * -filled: boolean
 * -dateCreated: java.util.Date
 * #GeometricObject()
 * #GeometricObject(color: string,filled: boolean)
 * +getColor(): String
 * +setColor(color: String): void
 * +isFilled(): boolean
 * +setFilled(filled: boolean): void
 * +getDateCreated(): java.util.Date
 * +toString(): String
 * +getArea(): double
 * +getPerimeter(): double
 * 
 * 
 * Class: Octagon
 * -side: double
 * +Octagon()
 * +Octagon(side: double)
 * +Octagon(side: double,color: string, filled: boolean)
 * +getSide(): double
 * +setSide(side: double): void
 * 
 * interface:Clonable
 * interface:Comparable
 */


public class Octagon extends GeometricObject {
	public static final String Cloneable = null;
	private double side;
	
	public Octagon() 
	{ }
	
	public Octagon(double side) 
	{
		this.side = side;
	}
	
	public Octagon(double side, String color, boolean filled) 
	{
		this.side = side;
		setColor(color);
		setFilled(filled);
	}
	
	/** Return side */
	public double getSide() 
	{
		return side;
	}
	
	/** Set a new side */
	public void setSide(double side) 
	{
		this.side = side;
	}
	
	/** Return area */
	public double getArea() 
	{
		return (2 + 4 / 22) * side * side;
	}
	
	/** Return perimeter */
	public double getPerimeter() 
	{
		return 8 * side;
	}

	public char[] compareTo(Object e) {
		return null;
	}

	
}
	
	