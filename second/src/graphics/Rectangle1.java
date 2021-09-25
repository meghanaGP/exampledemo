package graphics;

public class Rectangle1 extends Shape 
{
	private double length,breadth;
	public Rectangle1(double length,double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public double area()
	{
		return length*breadth;
	}

}
