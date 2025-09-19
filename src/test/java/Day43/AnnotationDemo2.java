package Day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
 * 1)login—------->@BeforeClass
2)Search—------->@Test
5)Adv search —---->@Test
6)Logout—----------->@AfterClass

 */

public class AnnotationDemo2 {
	
	@BeforeClass
	void login()
	{
		System.out.println("This is login");
	}
	
	@Test(priority=1)
	void advanceseach()
	{
		System.out.println("This is adv seacrch");
	}
	
	@Test(priority=0)
	void search()
	{
		System.out.println("This is seacrh");
	}
	
	
	@AfterClass
	void logout()
	{
		System.out.println("This is logout");
	}

}
