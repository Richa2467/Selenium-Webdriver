package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistner  implements ITestListener{
	
	public void onStart(ITestContext  context)     //Once before the execution strated.
	{
		System.out.println("Test execution is Started..... ");
	}
	
	public void onTestStart(ITestResult   result)  //before every @Test 
	{
		System.out.println("test started....");
	}
	
	public void onTestSuccess(ITestResult   result)
	{
		System.out.println("Test Passed....");
	}
	
	public void onTestFailure(ITestResult   result)
	{
		System.out.println("Test Failed....");
	}
	
	public void onTestSkip(ITestResult   result)
	{
		System.out.println("Test skiped....");
	}
	

	public void onFinish(ITestContext   context)
	{
		System.out.println("Test execution is completed...");
	
	}
}
