package question3;

abstract class Shape
{
	abstract double area();

}
class Circle extends Shape
{
	double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public double area()
	{
		return 3.14*radius*radius;
	}
}
class Rectangle extends Shape
{
	private double length,breadth;
	public Rectangle(double length,double breadth)
	{
		this.length =length;
		this.breadth = breadth;
	}
	public double area()
	{
		return length*breadth;
	}
}
