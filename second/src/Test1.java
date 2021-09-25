import factory.ShapesFactory;
import graphics.Shape;
import graphics.Circle1;
import graphics.Rectangle1;
import graphics.Triangle;
public class Test1 {

	public static void main(String[] args) 
	{
		int nR=0,nT=0,nC=0;
		Shape s = null;
		for(int i=1;i<=10;i++)
		{
			s = ShapesFactory.produceShape();
			System.out.println(s.area());
			if(s instanceof Circle1) nC++;
			else if(s instanceof Rectangle1) nR++;
			else nT++;			
		}
		System.out.println("Circles   " +nC);
		System.out.println("Rectangle   " +nR);
		System.out.println("Triangles  " +nT);
		
		
		
	}

}
