import java.lang.*;
import java.util.Arrays;

public class BankAccountTest {

	public static void main(String[] args) {
			  
		
		    BankAccount account = new BankAccount();
		    BankAccount account2 = new BankAccount();
		    
		    BankAccount.setAnnualInterestRate(4.5);
		    account.deposit(5000.0);
		    account.withdraw(2000.0);
		    
		   
		    System.out.println("The new account number is " + account.getId());
		    System.out.println("The account was created at " + account.getDateCreated());
		    System.out.println("Balance is " + account.getBalance());
		    System.out.println("Monthly interest is " + account.getMonthlyInterest());
		    System.out.println("The new number of accounts are " + (BankAccount.numberofaccounts));    
			

	}

}
