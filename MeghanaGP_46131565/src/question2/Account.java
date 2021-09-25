package question2;

import java.time.LocalDate;
import java.util.Date;

public class Account 
{
	
		private int accountNumber;
		private String accountHolderName;
	    private LocalDate openedDate;
		private double accountBalance;
		public Account(){ }
		public Account(int accountNumber, String accountHolderName,LocalDate openedDate,double accountBalance)
		{
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
	    this.openedDate = openedDate;
		this.accountBalance=accountBalance;
		}
		public void setAccountNumber(int accountNumber){ this.accountNumber =accountNumber;}
		
		public void setAccountHolderName(String accountHolderName) { this.accountHolderName = accountHolderName;}
	     public void setOpenedDate(LocalDate openedDate) { this.openedDate = openedDate;}

		public void setAccountBalance(double accountBalance){ this.accountBalance = accountBalance;}

		public int getAccountNumber(){ return accountNumber;}
		
		public String getAccountHolderName() { return accountHolderName;}
	     public LocalDate getOpenedDate() { return openedDate;}
		public double getAccountBalance(){ return accountBalance;}


		
		

		

		public String validateMessage()
		{
			if(accountBalance<5000)	
			{
				return("no minimum balance available");
			}
			else
				return("minimum balance available");
				
	        
		}

		



}
