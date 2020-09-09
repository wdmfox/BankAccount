/* *******************************************************
// ** CIS175 - CRN 13941
// ** Week 2 - BankAccount Project
// ** CheckingAccountBusinessLocic Class
// ** By Robert Fox, September 8, 2020
// *******************************************************
// **
// ** CheckingAccountBusinessLogic.java encapsulates a set of
// ** methods for the CheckingAccount class.
*/

package model;

import java.time.LocalDate;

public class CheckingAccountBusinessLogic {
	
	// newAccount instantiates a new CheckingAccount object using the 
	// initial balance and monthly service charge passed in
	public CheckingAccount newAccount (double initBalance, double monthlySrvChg) {
		
		CheckingAccount checkAcct = new CheckingAccount(initBalance, monthlySrvChg);
		
		return checkAcct;
	}
	
	// creditChecking adds the creditAmount passed in to the 
	// current balance of chkAccount
	public void creditChecking (CheckingAccount chkAccount, double creditAmount) {
		
		double currBalance = chkAccount.getCurrentBalance();
		
		double newBalance = currBalance + creditAmount;
		
		chkAccount.setCurrentBalance(newBalance);
	}
	
	// debitChecking subtracts the debitAmount passed in from the 
	// current balance of chkAccount
	public void debitChecking (CheckingAccount chkAccount, double debitAmount) {
		
		double currBalance = chkAccount.getCurrentBalance();
		
		double newBalance = currBalance - debitAmount;
		
		chkAccount.setCurrentBalance(newBalance);
	}
	
	
	// accountIsOverdrawn returns true if the current balance is
	// less than $0.00.  It returns true if otherwise.
	public boolean accountIsOverdrawn (CheckingAccount chkAccount) {
		
		if (chkAccount.getCurrentBalance() < 0.00)
		{
			return true;   // we are overdrawn
		}
		
		return false;      // we are not overdrawn
	}
	
	
	// accountAgeInMonths returns an integer value representing
	// the number of months since the account was opened
	public int accountAgeInMonths (CheckingAccount chkAccount) {
		
		LocalDate dateOpened = chkAccount.getDateOpened();
		
		LocalDate todaysDate = LocalDate.now();
		
		return (dateOpened.until(todaysDate).getMonths());
		
	}
	
	// loyaltyProgram returns true if account is eligible for the bank's loyalty 
	// rewards program
	public boolean loyaltyProgram (CheckingAccount chkAccount) {
		
		if (this.accountIsOverdrawn(chkAccount))      // if the account is overdrawn
		{                                             // it is not eligible
			return false;
		} else if (chkAccount.getCurrentBalance() > 9999.99)  // if the account balance is at
		{                                                     // least $10,000, it is eligible
			return true;
		} else if (this.accountAgeInMonths(chkAccount) > 35)  // if the account was opened at least
		{													  // 36 months ago, it is eligible
			return true;
		}
		
		return false;   // if we get here, the account is not eligible
	}
	
	// serviceChargeApplied returns the service charge amount for 
	// chkAccount. 
	public double serviceChargeApplied(CheckingAccount chkAccount) {
		
		if (this.loyaltyProgram(chkAccount))  // if account is eligible for the loyalty
		{                                     // rewards program, then return $0.00 (no serv charge)
			return 0.00;
		}
		
		return chkAccount.getMontlyServiceCharge();  // Otherwise, return the monthly service
	}												 // charge associated with the account

}
