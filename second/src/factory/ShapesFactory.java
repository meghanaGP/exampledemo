package factory;
import graphics.Shape;
import graphics.Rectangle1;
import graphics.Triangle;
import graphics.Circle1;
import java.util.Random;
public class ShapesFactory 
{
	public static Shape produceShape()
	{
		int n = new Random().nextInt();
		switch(n%3)
		{
		  case 0:
			  return new Circle1(4.5);
		  case 1:
			  return new Triangle(4.5,5.0);
		  default:
			  return new Rectangle1(6,5);
			
		
		}
	}

}
