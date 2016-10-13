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
 * Class:Circle
 * -radius: double
 * +Circle()
 * +Circle(radius: double)
 * +Circle(radius: double, color: string,filled: boolean)
 * +getRadius(): double
 * +setRadius(radius: double): void
 * +getDiameter(): double
 * 
 * Class: Rectangle
 * -width: double
 * -height: double
 * +Rectangle()
 * +Rectangle(width: double, height: double)
 * +Rectangle(width: double, height: double,color: string, filled: boolean)
 * +getWidth(): double
 * +setWidth(width: double): void
 * +getHeight(): double
 * +setHeight(height: double): void
 * 
 * Class: Octagon
 * -side: double
 * +Octagon()
 * +Octagon(side: double)
 * +Octagon(side: double,color: string, filled: boolean)
 * +getSide(): double
 * +setSide(side: double): void
 * 
 */

public abstract class GeometricObject 
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	protected GeometricObject() 
	{
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) 
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() 
	{
		return color;
	}

	/** Set a new color */
	public void setColor(String color) 
	{
		this.color = color;
	}

	/** Return filled. Since filled is boolean, the get method is named isFilled */
	public boolean isFilled() 
	{
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) 
	{
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() 
	{
		return dateCreated;
	}

	@Override
	public String toString() 
	{
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
}