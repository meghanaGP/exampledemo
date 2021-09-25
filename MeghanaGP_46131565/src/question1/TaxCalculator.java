package question1;

public class TaxCalculator 
{
	public static double taxableAmount(double monthlySalary)
	{
		double AnnualSalary= monthlySalary*12;
		double taxableAmt,amt;

		if(AnnualSalary>0 && AnnualSalary<=250000) 
			return 0;
		else if (AnnualSalary>250000 && AnnualSalary<=500000)
		{
			amt= AnnualSalary-250000;
			taxableAmt= 0.1*amt;
			return taxableAmt;
		}
		else if (AnnualSalary>=500000 && AnnualSalary<=1000000)
		{
			amt=AnnualSalary-500000;
			taxableAmt=(0.1*250000)+(0.2*amt);
			return taxableAmt;
		}
		else
		{
			amt=AnnualSalary-1000000;
			taxableAmt=(0.1*250000)+(0.2*500000)+(0.3*amt);
			return taxableAmt;

	}
	}

}
