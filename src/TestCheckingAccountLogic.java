/* *******************************************************
// ** CIS175 - CRN 13941
// ** Week 2 - BankAccount Project
// ** TestCheckingAccountLogic JUnit Test Cases
// ** By Robert Fox, September 8, 2020
// *******************************************************
// **
// ** TestCheckingAccountLogic.java contains JUnit Test Cases to 
// ** test some of the methods in the CheckingAccountBusinessLogic Class
*/

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CheckingAccountBusinessLogic;
import model.CheckingAccount;

public class TestCheckingAccountLogic {
	
	CheckingAccountBusinessLogic chkAcctBL = new CheckingAccountBusinessLogic();
	CheckingAccount checkingAcct = new CheckingAccount(8150.00, 5.00);

	@Before
	public void setUp() throws Exception {
	}

	// Test the debitChecking method and validate that
	// it is setting up the new balance correctly
	@Test
	public void testDebitChecking() {
		
		chkAcctBL.debitChecking(checkingAcct, 9000.00);  // debit $9,000.00 from the account balance
		
		double currBalance = checkingAcct.getCurrentBalance();
		
		assertEquals(-850.00, currBalance, 0.0);     // account balance should be ($850.00)
		
	}
	
	// Test the accountIsOverdrawn boolean function
	// to validate that it returns the correct value
	@Test
	public void testAccountIsOverdrawn() {
		
		chkAcctBL.debitChecking(checkingAcct, 8000.00);  // debit $8,000.00 from the account first
		
		assertFalse(chkAcctBL.accountIsOverdrawn(checkingAcct));  // should get back false 
		
	}

}
