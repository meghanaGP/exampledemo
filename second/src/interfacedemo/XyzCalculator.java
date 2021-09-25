package interfacedemo;

public class XyzCalculator implements Calculator {

	@Override
	public int power(int x, int n) 
	{
		int res = 1;
		for(;n>0;n--)
			res = res*x;
		return res;
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sum(int x, int y) 
	{
		return x-(-y);
		// TODO Auto-generated method stub
		
	}

	@Override
	public int square(int x) 
	{
	    int res =1;
	    for(int i=1;i<=2;i++)
	    	res = res*x;
		// TODO Auto-generated method stub
		return res;
	}

}
