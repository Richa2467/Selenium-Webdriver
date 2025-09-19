package Day43;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * 1)login—------->@BeforeMethod
2)Search—------->@Test
3)Logout—--------->@AfterMethod 


4)Login—---------->@BeforeMethod
5)Adv search —---->@Test
6)Logout—----------->@AfterMethod 

 */

public class AnnotationsDemo1 {
	@BeforeMethod
	void login()
	{
		System.out.println("This is login");
	}
	
	@Test(priority=2)
	void search()
	{
		System.out.println("This is search");
	}
	
	@Test(priority=6)
	void advancesearch()
	{
		System.out.println("This is advance search");
	}

	@AfterMethod
	void logout()
	{
		System.out.println("This is logout");
	}
}
