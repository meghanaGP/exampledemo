package graphics;

public class Circle1 extends Shape
{
	private double radius;
	public Circle1(double radius)
	{
		this.radius = radius;
	}
	public double area()
	{
		return 3.14*radius*radius;
	}

}
