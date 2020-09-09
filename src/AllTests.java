/* *******************************************************
// ** CIS175 - CRN 13941
// ** Week 2 - BankAccount Project
// ** AllTests JUnit Test Suite
// ** By Robert Fox, September 8, 2020
// *******************************************************
// **
// ** AllTests.java runs all the JUnit test cases for 
// ** the CheckingAccountBusinessLogic methods.
*/

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestCheckingAccountLogic.class, TestCheckingAccountLogic2.class })
public class AllTests {

}
