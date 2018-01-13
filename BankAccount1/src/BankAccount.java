import java.util.Arrays;
import java.lang.*;

public class BankAccount {
	
	  private String id;
	  private double checkingbalance;
	  private double savingbalance;
	  private static double annualInterestRate;
	  private static java.util.Date dateCreated;
	  public static int numberofaccounts = 0;
	  
	 
	  public BankAccount() {
		  dateCreated = new java.util.Date();
		    numberofaccounts++;   
	  }

	  
	  public BankAccount(String accountNumber, double checkingbalance, double savingbalance) {
	     
		  id = accountNumber;
	    this.checkingbalance = checkingbalance;
	    this.savingbalance = savingbalance;
	   
	  }
	
	  public void setId(String accountNumber) {
		    
		     id = accountNumber;
		    }
		  
	  public String getId() {
		  int [] numbers = new int[10];       
		    //Generates 10 Random Numbers in the range 0 -9
		  String myString = "";
		    for(int i = 0; i < numbers.length; i++) {
		     //numbers[i] = (int)(Math.random()*10 );
		    	myString+= (int)(Math.random()*10 );
		    			
		    }
	    return myString;
	  }
	  
	  public void setBalance(double checkingbalance, double savingbalnce) {
		  
		    this.checkingbalance = checkingbalance;
		    this.savingbalance = savingbalance;
		  }

	  public double getBalance() {
	    return checkingbalance + savingbalance;
	  }

	  public static double getAnnualInterestRate() {
	    return annualInterestRate;
	  }

	  public static void setAnnualInterestRate(double newAnnualInterestRate) {
	    annualInterestRate = newAnnualInterestRate;
	  }

	  public double getMonthlyInterest() {
	    return checkingbalance * (annualInterestRate / 1200);
	  }

	  public java.util.Date getDateCreated() {
	    return dateCreated;
	  }

	  public void withdraw(double amount) {
	    checkingbalance -= amount;
	  }

	  public void deposit(double amount) {
	    checkingbalance += amount;
	  }
	

	
	}

	


