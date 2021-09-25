package question2;
import question2.InsufficientBalanceException;

public class Transaction 
{
	public static void deposit(Account account,double amount)
	{
		account.setAccountBalance(account.getAccountBalance()+amount);
	}
	public static void withdraw(Account account,double amount) throws InsufficientBalanceException
	{
		double AccountBalance = account.getAccountBalance();
		if(AccountBalance-amount >=5000)
			account.setAccountBalance(AccountBalance-amount);
		else
			throw new InsufficientBalanceException
			(AccountBalance-amount+"is not sufficient as min deposit");
	}

}
