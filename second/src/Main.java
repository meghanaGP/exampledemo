
import interfacedemo.XyzCalculator;
import interfacedemo.Calculator;

public class Main {

	public static void main(String[] args)
	{
		Calculator c = new XyzCalculator();
		System.out.println(c.power(5, 3));
		System.out.println(c.square(12));
		System.out.println(c.sum(102, 23));
		
	}

}
