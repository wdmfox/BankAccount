/* *******************************************************
// ** CIS175 - CRN 13941
// ** Week 2 - BankAccount Project
// ** CheckingAccount Class
// ** By Robert Fox, September 8, 2020
// *******************************************************
// **
// ** CheckingAccount.java is a class that contains properties, getters and setters
// ** for a checking account product.
*/

package model;

import java.time.LocalDate;

public class CheckingAccount {
	
	private double currentBalance;        // current account balance
	private double montlyServiceCharge;   // monthly service charge
	private LocalDate dateOpened;         // original date account was opened
	
	// default constructor
	
	public CheckingAccount() {
		this.setCurrentBalance(0.00);        // set account balance to zero
		this.setMontlyServiceCharge(3.00);   // set monthly service charge to $3.00
		this.setDateOpened(LocalDate.now()); // set date opened to current date
	}
	
	// non-default constructor with initial balance and monthly service charged
	// passed to it
	
	public CheckingAccount(double initialBalance, double monthlyServChg) {
		this.setCurrentBalance(initialBalance);
		this.setMontlyServiceCharge(monthlyServChg);
		this.setDateOpened(LocalDate.now());
	}
	
	// getters and setters
	
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public double getMontlyServiceCharge() {
		return montlyServiceCharge;
	}
	public void setMontlyServiceCharge(double montlyServiceCharge) {
		this.montlyServiceCharge = montlyServiceCharge;
	}
	public LocalDate getDateOpened() {
		return dateOpened;
	}
	public void setDateOpened(LocalDate dateOpened) {
		this.dateOpened = dateOpened;
	}
	
	

}
