package question2;

import java.time.LocalDate;

public class AccountMain {

	public static void main(String[] args) 
	{
		Account a1 = new Account(786,"Abhi",LocalDate.now(),10000);
		try
		{
			Transaction.withdraw(a1, 4000);
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("After transaction balance is " +a1.getAccountBalance());
		
		

	}

}
