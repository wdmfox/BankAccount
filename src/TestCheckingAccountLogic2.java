/* *******************************************************
// ** CIS175 - CRN 13941
// ** Week 2 - BankAccount Project
// ** TestCheckingAccountLogic2 JUnit Test Cases
// ** By Robert Fox, September 8, 2020
// *******************************************************
// **
// ** TestCheckingAccountLogic2.java contains JUnit Test Cases to 
// ** test some of the methods in the CheckingAccountBusinessLogic Class
*/

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.CheckingAccount;
import model.CheckingAccountBusinessLogic;

public class TestCheckingAccountLogic2 {

	CheckingAccountBusinessLogic chkAcctBL = new CheckingAccountBusinessLogic();
	CheckingAccount checkingAcct = new CheckingAccount();

	@Before
	public void setUp() throws Exception {
	}
	
	// Test the creditChecking method and validate that
	// it is setting up the new balance correctly
	@Test
	public void testCreditChecking() {
		
		chkAcctBL.creditChecking(checkingAcct, 10000.00);   // credit the account with $10,000.00
		
		double currBalance = checkingAcct.getCurrentBalance();  
		
		assertEquals(10000.00, currBalance, 0.0);           // the new balance should be $10,000.00
		
	}
	
	@Test
	public void testLoyaltyProgram() {
		
		chkAcctBL.creditChecking(checkingAcct, 10000.00);  // credit the account with $10,000.00

		assertTrue(chkAcctBL.loyaltyProgram(checkingAcct));  // loyaltyProgram should return true
		                                                     // because the balance is over $9,999.99
		
	}

}
