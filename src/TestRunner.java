/* *******************************************************
// ** CIS175 - CRN 13941
// ** Week 2 - BankAccount Project
// ** TestRunner JUnit Main Test Execution
// ** By Robert Fox, September 8, 2020
// *******************************************************
// **
// ** TestRunner.java executes the AllTests.class test suite. 
*/

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(AllTests.class);
		
		for (Failure failure : result.getFailures())
		{
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());

	}

}
