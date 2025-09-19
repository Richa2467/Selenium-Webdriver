package Day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	@AfterSuite
	void as()
	{
		System.out.println("this is Aftersuit method....");
	}
	@BeforeSuite
	void bs()
	{
		System.out.println("this is beforesuit method....");
	}
	@AfterTest
	void at()
	{
		System.out.println("this is Aftertest method.....");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("this is Beforetest method.....");
	}
	@BeforeClass
	void c1()
	{
		System.out.println("This is before class ");
		
	}
	
	
	@AfterClass
	void c2()
	{
		System.out.println("This is After class");
		
	}
	
	@BeforeMethod
	void m1()
	{
		System.out.println("this is before method");
	}
	
	@AfterMethod
	void m2()
	{
		System.out.println("this is After method");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search ");
		
	}
	@Test(priority=2)
	void advancesearch()
	{
		System.out.println("This is advanced search ");
	}

	

}
