package graphics;

public class Triangle extends Shape 
{
	private double base,height;
	public Triangle(double base,double height)
	{
		this.height = height;
		this.base = base;
	}
	public double area()
	{
		return 0.5*base*height;
	}

}
